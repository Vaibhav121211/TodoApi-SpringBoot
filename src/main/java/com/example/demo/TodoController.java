package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todoList;

    public TodoController() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, false, "Todo1", 1));
        todoList.add(new Todo(2,true,"Todo2",2));
    }

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todoList;
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo) {
        todoList.add(newTodo);
        return newTodo;
    }

    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoId(@PathVariable Long todoId) {
        for(Todo todo : todoId) {
            return ResponseEntity.ok(todo);
        }
    }

    return ResponseEntity.notFound().build();
}
