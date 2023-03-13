package com.example.ticketmaster.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@Table(name="events")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Instant event_date;
    
    public void setName(String name) {
    	this.name=name;
    }
    public void setEvent_date(Instant event_date) {
    	this.event_date=event_date;
    }
    
    public String getName() {
    	return name;
    }
    public Instant getEvent_date() {
    	return event_date;
    }
    public Long getId() {
    	return id;
    }
}
