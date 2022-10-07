package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String NAME = "To Do";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String taskListName = taskList.getListName();

        //When
        List<TaskList> readListTasksName = taskListDao.findByListName(taskListName);
        System.out.println(readListTasksName);

        //Then
        assertEquals(1, readListTasksName.size());
//        assertEquals("To Do", readListTasksName);

        //CleanUp
        taskListDao.delete(readListTasksName.get(0));
    }

}
