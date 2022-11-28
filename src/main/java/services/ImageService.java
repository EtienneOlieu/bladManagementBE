package services;

import models.Image;
import repositories.ImageRepository;

import java.util.Optional;
import java.util.Set;

public class ImageService implements IImageService{

    private ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository){
        this.imageRepository = imageRepository;
    }

    @Override
    public Set<Image> findAll() {
        return null;
    }

    @Override
    public Image save(Image object) {
        return null;
    }

    @Override
    public void delete(Image object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Image> findById(Long aLong) {
        return Optional.empty();
    }
}
