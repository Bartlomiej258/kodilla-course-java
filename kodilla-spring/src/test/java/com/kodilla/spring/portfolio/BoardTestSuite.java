package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);

    @Test
    void testTaskAdd() {
        //Given
        //When
        board.getToDoList().getTasks().add("shopping");
        String toDoList = board.getToDoList().getTasks().get(0);

        board.getInProgressList().getTasks().add("reading a book..");
        String inProgressList = board.getInProgressList().getTasks().get(0);

        board.getDoneList().getTasks().add("shower");
        String doneList = board.getDoneList().getTasks().get(0);

        //Then
        Assertions.assertEquals(toDoList, "shopping");
        Assertions.assertEquals(inProgressList, "reading a book..");
        Assertions.assertEquals(doneList, "shower");
    }
}
