package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskFinancialDetailDao extends CrudRepository<TaskFinancialDetails, Integer> {

    List<TaskFinancialDetails> findByPaid(boolean paid);

}
