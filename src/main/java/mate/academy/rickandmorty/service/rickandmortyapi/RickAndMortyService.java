package mate.academy.rickandmorty.service.rickandmortyapi;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.CharacterResultsDataDto;
import mate.academy.rickandmorty.mapper.CharacterMapper;
import mate.academy.rickandmorty.repository.character.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RickAndMortyService {

    private static final String BASE_URL = "https://rickandmortyapi.com/api/character/?page=%s";
    private static final int DEFAULT_NUMBER_PAGE = 1;

    private final RickAndMortyClient rickAndMortyClient;
    private final CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    private final List<CharacterResultsDataDto> allResults = new ArrayList<>();

    public void getAllCharacters() {
        int page = DEFAULT_NUMBER_PAGE;

        while (true) {
            String url = String.format(BASE_URL, page);
            List<CharacterResultsDataDto> results = rickAndMortyClient.getAllCharactersFromApi(url);

            if (results == null || results.isEmpty()) {
                break;
            }

            allResults.addAll(results);
            page++;
        }

        characterRepository.saveAll(characterMapper.toModelList(allResults));
    }
}
