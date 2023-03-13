package com.example.ticketmaster.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "First name can not be null")
    @Size(min = 2, message = "First name can not be less than 2 characters")
    private String first_name;

    private String last_name;

    private int age;

    @Email(message = "Email is not formatted correctly")
    private String email;

    @ManyToOne
    private Event event ;
    
    public void setAge(int age) {
    	this.age=age;
    }
    public void setFirst_name(String first_name) {
    	this.first_name=first_name;
    }
    public void setLast_name(String last_name) {
    	this.last_name=last_name;
    }
    public void setEmail(String email) {
    	this.email=email;
    }
    public void setEvent(Event event) {
    	this.event=event;
    }
    
    
    public int getAge() {
    	return age;
    }
    public String getFirst_name() {
    	return first_name;
    }
    public String getLast_name() {
    	return last_name;
    }
    public String getEmail() {
    	return email;
    }
    public Event getEvent() {
    	return event;
    }
    public Long getId() {
    	return id;
    }
    
    
    
    
}
