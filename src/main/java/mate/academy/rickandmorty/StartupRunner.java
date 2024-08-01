package mate.academy.rickandmorty;

import mate.academy.rickandmorty.service.rickandmortyapi.RickAndMortyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final RickAndMortyService rickAndMortyService;

    public StartupRunner(RickAndMortyService rickAndMortyService) {
        this.rickAndMortyService = rickAndMortyService;
    }

    @Override
    public void run(String... args) throws Exception {
        rickAndMortyService.getAllCharacters();
    }
}
