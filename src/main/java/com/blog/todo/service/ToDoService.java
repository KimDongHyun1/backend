package com.blog.todo.service;

import com.blog.todo.dto.*;
import com.blog.todo.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public List<ToDo> todos(ToDoReqDto toDoReqDto) {
        List<ToDo> all = toDoRepository.findAll();

        return toDoRepository.findAll();
    }

    public void createToDo(ToDoCreateReqDto toDoCreateReqDto) {
        ToDo createdToDo = new ToDo(toDoCreateReqDto.getText(), "N");
        toDoRepository.save(createdToDo);
    }

    public void deleteToDo(ToDoDeleteReqDto toDoDeleteReqDto) {
        ToDo todo = toDoRepository.findById(toDoDeleteReqDto.getId()).orElse(null);
        if(todo == null) {
            throw new RuntimeException("이미 삭제 되었습니다.");
        }

        toDoRepository.delete(todo);
    }

    public void updateToDo(ToDoUpdateReqDto toDoUpdateReqDto) {
        ToDo todo = toDoRepository.findById(toDoUpdateReqDto.getId()).orElse(null);
        if(todo == null) {
            throw new RuntimeException("이미 삭제 되었습니다.");
        }
        todo.setCompleted(toDoUpdateReqDto.getCompleted());

        toDoRepository.saveAndFlush(todo);
    }
}
