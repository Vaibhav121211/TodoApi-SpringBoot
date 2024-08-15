package com.example.demo;


import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<String> todos;

    public TodoController() {
        todos = new ArrayList<>();
        todos.add(new Todo(1, false, "Todo1", 1));
        todos.add(new Todo(2,true,"Todo2",2));
    }
}
