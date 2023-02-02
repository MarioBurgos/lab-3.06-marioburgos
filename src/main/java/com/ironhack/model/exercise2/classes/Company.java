package com.ironhack.model.exercise2.classes;

import jakarta.persistence.Embeddable;

@Embeddable
public class Company {

    private String name;
    private String address;
    private String telephone;

    public Company() {
    }

    public Company(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
