package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IArtistService;

@RestController
public class ArtistController {

    private IArtistService artistService;

    public ArtistController(IArtistService artistService) {
        this.artistService = artistService;
    }
}
