package com.fitness.model.person;

import java.time.LocalDateTime;

public abstract class Person {
    private String id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private LocalDateTime dob;

    public Person() {

    }

    public Person(String id, String email, String address) {
        this.id = id;
        this.name = null;
        this.phone = null;
        this.email = email;
        this.address = address;
        this.dob = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
}
