package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;



public class SearchService {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    public List<Company> searchCompanyByName(final String companyName) {


     return companyDao.searchCompany(companyName);

    }
    public List<Employee> searchEmployeeByName(final String lastName) {

        return employeeDao.searchEmployee(lastName);
    }
}
