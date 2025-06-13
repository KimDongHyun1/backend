package com.blog.todo.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Entity
@Table(name = "todos")
@NoArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @Setter
    private String completed;

    public ToDo(String text, String completed) {
        this.text = text;
        this.completed = completed;
    }
}
