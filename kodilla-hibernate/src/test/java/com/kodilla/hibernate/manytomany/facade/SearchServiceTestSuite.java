package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchServiceTestSuite {

//    @Autowired
//    private SearchService searchService;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

   @Test
     void testSearchCompanyByNameTest() {

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalthy");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //when
        List<Company> nameCompany = companyDao.searchCompany("Dat");
        List<Employee> employeeName = employeeDao.searchEmployee("th");

        // Then
      //  try {
            assertEquals(1, nameCompany.size());
            assertEquals(2,employeeName.size());
  //      } finally {
//            employeeDao.deleteAll();
//            companyDao.deleteAll();
        }
}
