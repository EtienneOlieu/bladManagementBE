package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IOrderService;

@RestController
public class OrderController {

    private IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }
}
