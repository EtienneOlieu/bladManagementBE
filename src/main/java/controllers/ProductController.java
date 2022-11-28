package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IProductService;

@RestController
public class ProductController {

    private IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }
}
