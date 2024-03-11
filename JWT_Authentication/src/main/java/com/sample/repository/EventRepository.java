package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.entity.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, String> {
    Event findByEventName(String eventName);
}
