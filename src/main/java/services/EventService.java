package services;

import models.Event;
import org.springframework.stereotype.Service;
import repositories.EventRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class EventService implements IEventService{

    private EventRepository eventRepository;

    public EventService (EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    @Override
    public Set<Event> findAll() {
        return null;
    }

    @Override
    public Event save(Event object) {
        return null;
    }

    @Override
    public void delete(Event object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Event> findById(Long aLong) {
        return Optional.empty();
    }
}
