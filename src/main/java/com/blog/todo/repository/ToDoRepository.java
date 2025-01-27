package com.blog.todo.repository;

import com.blog.todo.dto.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
