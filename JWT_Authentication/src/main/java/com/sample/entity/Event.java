package com.sample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Events")
public class Event {
    
    @Id
    private String eventName;
    private int numberOfGuests;
    private double budget;
    private String foodPreferences;
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public int getNumberOfGuests() {
        return numberOfGuests;
    }
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public String getFoodPreferences() {
        return foodPreferences;
    }
    public void setFoodPreferences(String foodPreferences) {
        this.foodPreferences = foodPreferences;
    }
    public Event(String eventName, int numberOfGuests, double budget, String foodPreferences) {
        this.eventName = eventName;
        this.numberOfGuests = numberOfGuests;
        this.budget = budget;
        this.foodPreferences = foodPreferences;
    }

    public Event()
    {

    }
    
}
