package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.entity.Event;
import com.sample.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public void createEvent(@RequestBody Event event) {
        eventService.addEvent(event);
    }

    @DeleteMapping("/{eventName}")
    public void removeEvent(@PathVariable String eventName) {
        Event event = eventService.getEventByName(eventName);
        eventService.removeEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{eventName}")
    public Event getEventByName(@PathVariable String eventName) {
        return eventService.getEventByName(eventName);
    }

    @PutMapping("/{eventName}")
    public void updateEvent(@PathVariable String eventName, @RequestBody Event updatedEvent) {
        Event event = eventService.getEventByName(eventName);
        event.setNumberOfGuests(updatedEvent.getNumberOfGuests());
        event.setBudget(updatedEvent.getBudget());
        event.setFoodPreferences(updatedEvent.getFoodPreferences());
        eventService.updateEvent(event);
    }
}
