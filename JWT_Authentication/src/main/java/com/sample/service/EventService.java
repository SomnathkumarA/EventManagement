package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.sample.entity.Booking;
import com.sample.entity.Event;
import com.sample.repository.EventRepository;

import java.util.List;

@Service
public class EventService {
    
    @Autowired
    private EventRepository eventRepository;

    public void addEvent(Event event) {
        eventRepository.save(event);
    }

    public void removeEvent(Event event) {
        eventRepository.delete(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventByName(String eventName) {
        return eventRepository.findByEventName(eventName);
    }

    public void updateEvent(Event event) {
        eventRepository.save(event);
    }

    // public void addBook(Booking book) {
    //     throw new UnsupportedOperationException("Unimplemented method 'addBook'");
    // }
}
