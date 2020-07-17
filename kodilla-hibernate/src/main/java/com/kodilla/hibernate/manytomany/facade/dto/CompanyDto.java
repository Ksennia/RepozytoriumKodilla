package com.kodilla.hibernate.manytomany.facade.dto;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
