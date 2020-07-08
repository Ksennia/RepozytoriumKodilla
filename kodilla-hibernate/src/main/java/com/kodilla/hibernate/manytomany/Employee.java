package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(
                name = "Employee.retrieveLastname",
                query = "from EMPLOYEES WHERE lastname = :LASTNAME"),
        @org.hibernate.annotations.NamedQuery(
                name = "Employee.searchEmployee",
                query = "from EMPLOYEES WHERE lastname LIKE : ARG == %LASTNAME%"
        )
})
@Entity
@Table(name = "EMPLOYEES")
@Component
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Employee() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "JOIN_COMPANY_EMPLOYEE",
                joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
                inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")})
    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
