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
public class SearchCompanyOrEmployeeFacadeTest {

    @Autowired
    SearchCompanyOrEmployeeFacade searchCompanyOrEmployeeFacade;

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    Company wedel = new Company("Lotte Wedel");
    Company nestle = new Company("Nestle");

    Employee johnDoe = new Employee("John", "Doe");
    Employee jackJohnes = new Employee("Jack", "Johnes");
    Employee lolaScream = new Employee("Lola", "Scream");


    @Test
    public void SearchCompanyTest() throws SearchProcessingException {

        //Given
        companyDao.save(wedel);
        companyDao.save(nestle);

        //When
        List<Company> findCompanies = searchCompanyOrEmployeeFacade.findCompanyByPartOfName("Lot");

        //Then
        assertEquals(1, findCompanies.size());

        //Cleanup
        companyDao.deleteById(nestle.getId());
        companyDao.deleteById(wedel.getId());
    }

    @Test
    public void SearchEmployeeTest() throws SearchProcessingException {

        //Given
        employeeDao.save(johnDoe);
        employeeDao.save(jackJohnes);
        employeeDao.save(lolaScream);

        //When
        List<Employee> findEmployees = searchCompanyOrEmployeeFacade.findEmployeeByPartOfName("John");

        //Then
        assertEquals(2, findEmployees.size());

        //Cleanup
        employeeDao.deleteById(jackJohnes.getId());
        employeeDao.deleteById(johnDoe.getId());
        employeeDao.deleteById(lolaScream.getId());
    }
}