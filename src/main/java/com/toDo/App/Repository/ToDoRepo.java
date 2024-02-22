package com.toDo.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toDo.App.model.ToDo;

@Repository
public interface ToDoRepo extends JpaRepository<ToDo, Long>{

}