package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticDirectoryTestSuite {


    @Test
    void calculateAdvStatistics_shouldReturn0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();

        // When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfUsers());
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfPosts());
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfComments());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfPostPerUser(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerUser(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost(), 0);
    }

    @Test
    void calculateAdvStatistics_shouldReturn1000posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(10, statisticsCalculate.getNumberOfUsers());
        Assertions.assertEquals(1000, statisticsCalculate.getNumberOfPosts());
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfComments());
        Assertions.assertEquals(100, statisticsCalculate.getAverageNumberOfPostPerUser());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerUser(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost(), 0);
    }

    @Test
    void calculateAdvStatistics_sholudreturn0comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        List<String> users = generateForumUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(100, statisticsCalculate.getNumberOfUsers(), 100);
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfPosts(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfComments(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfPostPerUser(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerUser(), 0);
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost(), 0);
    }

    @Test
    void calculateAdvStatistics_commentsLessThanPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        List<String> users = generateForumUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(100, statisticsCalculate.getNumberOfUsers());
        Assertions.assertEquals(1000, statisticsCalculate.getNumberOfPosts());
        Assertions.assertEquals(100, statisticsCalculate.getNumberOfComments());
        Assertions.assertEquals(10, statisticsCalculate.getAverageNumberOfPostPerUser());
        Assertions.assertEquals(1, statisticsCalculate.getAverageNumberOfCommentsPerUser());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost());
        Assertions.assertTrue(statisticsCalculate.getNumberOfComments() < statisticsCalculate.getNumberOfPosts());
    }

    @Test
    void calculateAdvStatistics_commentsBiggerThanPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        List<String> users = generateForumUsers(10);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(10, statisticsCalculate.getNumberOfUsers());
        Assertions.assertEquals(10, statisticsCalculate.getNumberOfPosts());
        Assertions.assertEquals(50, statisticsCalculate.getNumberOfComments());
        Assertions.assertEquals(1, statisticsCalculate.getAverageNumberOfPostPerUser());
        Assertions.assertEquals(5, statisticsCalculate.getAverageNumberOfCommentsPerUser());
        Assertions.assertTrue(statisticsCalculate.getNumberOfPosts() < statisticsCalculate.getNumberOfComments());
    }

    @Test
    void calculateAdvStatistics_shlouldReturn0users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculate statisticsCalculate = new StatisticsCalculate();
        List<String> users = generateForumUsers(0);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCalculate.calculateAdvStatistics(statisticsMock);
        statisticsCalculate.showStatistics();

        //Then
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfUsers());
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfPosts());
        Assertions.assertEquals(0, statisticsCalculate.getNumberOfComments());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfPostPerUser());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost());
        Assertions.assertEquals(0, statisticsCalculate.getAverageNumberOfCommentsPerPost());
    }

    List<String> generateForumUsers(int usersQuantity) {
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < usersQuantity; i++) {
            users.add("Adam");
        }
        return users;
    }
}
