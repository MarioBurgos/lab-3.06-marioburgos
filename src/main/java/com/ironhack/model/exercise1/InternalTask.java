package com.ironhack.model.exercise1;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task{

    public InternalTask() {
    }

    public InternalTask(String title, LocalDate dueDate, Boolean status) {
        super(title, dueDate, status);
    }
}
