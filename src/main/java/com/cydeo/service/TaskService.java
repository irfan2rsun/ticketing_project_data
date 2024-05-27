package com.cydeo.service;

import com.cydeo.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    //Adding business logic for save,update,delete,show all task, give me certain task
    List<TaskDTO> listAllTask();

    void save(TaskDTO task);

    void update(TaskDTO task);

    void delete(Long id);

    TaskDTO findById(Long id);

}
