// package com.sample.controller;

// import com.sample.entity.Booking;
// import com.sample.entity.Event;
// import com.sample.service.EventService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/bookings")
// public class BookingController {

//     @Autowired
//     private EventService eventService;

//     @PostMapping
//     public void createBook(@RequestBody Booking book) {
//         eventService.addBook(book);
//     }

//     @GetMapping
//     public List<Event> getAllBook() {
//         return eventService.getAllEvents();
//     }
// }
