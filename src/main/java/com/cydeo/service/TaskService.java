package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.dto.TaskDTO;
import com.cydeo.enums.Status;

import java.util.List;

public interface TaskService {

    //Adding business logic for save,update,delete,show all task, give me certain task...
    List<TaskDTO> listAllTask();

    void save(TaskDTO task);

    void update(TaskDTO task);

    void delete(Long id);

    TaskDTO findById(Long id);

    int totalNonCompletedTask(String projectCode);

    int totalCompletedTask(String projectCode);

    void deleteByProject(ProjectDTO projectDTO);

    void completeByProject(ProjectDTO projectDTO);

    List<TaskDTO> listAllTasksByStatusIsNot(Status status);

    List<TaskDTO> listAllTasksByStatus(Status status);

}
