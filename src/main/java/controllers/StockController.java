package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IStockService;

@RestController
public class StockController {

    private IStockService stockService;

    public StockController(IStockService stockService) {
        this.stockService = stockService;
    }
}
