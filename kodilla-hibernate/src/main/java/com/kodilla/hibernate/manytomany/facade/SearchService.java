package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    private CompanyDao company;
    @Autowired
    private EmployeeDao employee;


    public List<Company> searchCompanyByName(final String companyName) {
     List<Company> companiesSearch = new ArrayList<>();
     companiesSearch.add(company.searchCompany(companyName));
     return companiesSearch;

    }
    public List<Employee> searchEmployeeByName(final String lastName) {
        List<Employee> employeesSearch = new ArrayList<>();
        employeesSearch.add(employee.searchEmployee(lastName));
        return employeesSearch;
    }
}
