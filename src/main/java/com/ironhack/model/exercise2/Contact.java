package com.ironhack.model.exercise2;

import com.ironhack.model.exercise2.classes.Company;
import com.ironhack.model.exercise2.classes.Name;
import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Name name;
    private String title;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "company_name")),
            @AttributeOverride(name = "address", column = @Column(name = "company_address")),
            @AttributeOverride(name = "telephone", column = @Column(name = "company_telephone"))
    })
    private Company company;

    public Contact() {
    }

    public Contact(Name name, String title, Company company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
