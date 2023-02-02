package com.ironhack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Task{
    private Double hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, LocalDate dueDate, Boolean status, Double hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
