package com.kodilla.hibernate.manytomany.facade;


public class SearchProcessingException extends Exception {

    public static String ERR_COMPANY_NOT_EXISTS = "That name Company not exist";
    public static String ERR_EMPLOYEE_NOT_EXISTS = "That name Employee not exist";

    public SearchProcessingException(String message){
        super(message);
    }
}