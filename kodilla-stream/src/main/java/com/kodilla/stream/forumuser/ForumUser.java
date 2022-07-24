package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    final private int userId;
    final private String name;
    final private char gender;
    final private LocalDate age;
    final private int quantityOfPosts;

    public ForumUser(int userId, String name, char gender, int yearOfBirth, int monthOfBirth, int dayOfBirth, int quantityOfPosts) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.age = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getAge() {
        return age;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return
                "userId=" + userId +
                        ", name='" + name + '\'' +
                        ", gender=" + gender +
                        ", dateOfBirth=" + age +
                        ", quantityOfPosts=" + quantityOfPosts;
    }
}
