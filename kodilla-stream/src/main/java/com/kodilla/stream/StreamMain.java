package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        Forum forum = new Forum();
        Map<Integer, ForumUser> userList = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> Period.between(user.getAge(), today).getYears() >= 20)
                .filter(user -> user.getQuantityOfPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        userList.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}
