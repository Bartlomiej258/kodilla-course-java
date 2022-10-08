package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.dao.TaskFinancialDetailDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(StringExtension.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailDao taskFinancialDetailDao;

    @Test
    void testFindByPaid() {

        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailDao.findByPaid(false);

        //Then
        assertEquals(1, resultList.size());

        //CleanUp
        taskFinancialDetailDao.deleteById(id);
    }

}
