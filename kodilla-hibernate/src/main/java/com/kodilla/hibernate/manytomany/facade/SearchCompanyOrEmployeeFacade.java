package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchCompanyOrEmployeeFacade {

    public static final Logger logger = LoggerFactory.getLogger(SearchCompanyOrEmployeeFacade.class);

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public SearchCompanyOrEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByPartOfName(String lettersInName) throws SearchProcessingException {
        lettersInName = '%' + lettersInName + '%';
        return companyDao.findCompaniesByLetters(lettersInName);
    }

    public List<Employee> findEmployeeByPartOfName(String lettersInName) throws SearchProcessingException {
        lettersInName = '%' + lettersInName + '%';
        return employeeDao.findEmployeeByLetters(lettersInName);
    }


}