package com.kodilla.good.patterns.challenges;

public class MailService implements InformationServiceInterface {


    @Override
    public void inform(User user) {
        System.out.println("Sending email to user... " + user.getFirstName() + " " + user.getLastName());
    }
}
