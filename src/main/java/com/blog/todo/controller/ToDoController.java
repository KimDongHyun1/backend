package com.blog.todo.controller;


import com.blog.todo.dto.*;
import com.blog.todo.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("todo")
public class ToDoController {

    private final ToDoService toDoService;

    @PostMapping("getTodos")
    public List<ToDo> todos(@RequestBody ToDoReqDto toDoReqDto) {
        return toDoService.todos(toDoReqDto);
    }

    @PostMapping("createToDo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createToDo(@RequestBody ToDoCreateReqDto toDoCreateReqDto) {
        toDoService.createToDo(toDoCreateReqDto);
    }

    @PostMapping("deleteToDo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteToDo(@RequestBody ToDoDeleteReqDto toDoDeleteReqDto) {
        toDoService.deleteToDo(toDoDeleteReqDto);
    }

    @PostMapping("updateToDo")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateToDo(@RequestBody ToDoUpdateReqDto toDoUpdateReqDto) {
        toDoService.updateToDo(toDoUpdateReqDto);
    }
}

















