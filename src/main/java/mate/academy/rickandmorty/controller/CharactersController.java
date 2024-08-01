package mate.academy.rickandmorty.controller;

import mate.academy.rickandmorty.service.rickandmortyapi.RickAndMortyClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharactersController {

    private final RickAndMortyClient rickAndMortyClient;

    public CharactersController(RickAndMortyClient rickAndMortyClient) {
        this.rickAndMortyClient = rickAndMortyClient;
    }
}
