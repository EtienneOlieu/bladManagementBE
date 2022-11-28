package controllers;

import org.springframework.web.bind.annotation.RestController;
import services.IEventService;

@RestController
public class EventController {

    private IEventService eventService;

    public EventController(IEventService eventService) {
        this.eventService = eventService;
    }
}
