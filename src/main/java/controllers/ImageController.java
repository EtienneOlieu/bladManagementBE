package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IImageService;

@RestController
public class ImageController {

    private IImageService imageService;

    public ImageController(IImageService imageService) {
        this.imageService = imageService;
    }
}
