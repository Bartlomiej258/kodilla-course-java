package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.library.LibraryUser;

public class StatisticsCalculate {

    private int numberOfUsers = 0;
    private int numberOfPosts = 0;
    private int numberOfComments = 0;
    private int averageNumberOfPostPerUser = 0;
    private int averageNumberOfCommentsPerUser = 0;
    private int averageNumberOfCommentsPerPost = 0;

    public StatisticsCalculate() {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averageNumberOfPostPerUser = averageNumberOfPostPerUser;
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getAverageNumberOfPostPerUser() {
        return averageNumberOfPostPerUser;
    }

    public int getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public int getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers > 0) {
            averageNumberOfPostPerUser = numberOfPosts / numberOfUsers;
            averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        }

        if (numberOfUsers < 0) {
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {

        System.out.println("Number of users: " + numberOfUsers);
        System.out.println("Number of posts: " + numberOfPosts);
        System.out.println("Number of comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averageNumberOfPostPerUser);
        System.out.println("Average number of comments per user: " + averageNumberOfCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberOfCommentsPerPost);
    }
}
