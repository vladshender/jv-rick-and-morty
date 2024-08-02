package mate.academy.rickandmorty.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.dto.CharacterSearchParameters;
import mate.academy.rickandmorty.service.CharacterServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
@RequiredArgsConstructor
public class CharactersController {

    private final CharacterServiceImpl characterService;

    @GetMapping("/all")
    public List<CharacterDto> getAll() {
        return characterService.getAll();
    }

    @GetMapping("/random")
    public CharacterDto getRandomCharacter() {
        return characterService.getRandomCharacter();
    }

    @GetMapping("/search")
    public List<CharacterDto> search(CharacterSearchParameters characterSearchParameters) {
        return characterService.search(characterSearchParameters);
    }
}
