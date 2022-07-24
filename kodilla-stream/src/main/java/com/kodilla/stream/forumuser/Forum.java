package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> users = new ArrayList<>();

    public List<ForumUser> getUserList() {

        users.add(new ForumUser(1, "Robert", 'M', 1999, 6, 2, 6));
        users.add(new ForumUser(2, "Marek", 'M', 2001, 1, 13, 15));
        users.add(new ForumUser(3, "Marcelina", 'F', 2012, 7, 4, 22));
        users.add(new ForumUser(4, "Rafał", 'M', 2015, 12, 8, 2));
        users.add(new ForumUser(5, "Paweł", 'M', 1999, 4, 9, 7));
        users.add(new ForumUser(6, "Monika", 'F', 1988, 5, 11, 1));

        return users;
    }
}
