package com.business;

import com.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;
    public TodoBusinessImpl(TodoService todoService){
        this.todoService = todoService;
    }
    public void deletetodosnotrelatedtospring(String user){
        List<String> todos = todoService.retriveTodos(user);

        for (String todo: todos){
            if(!todo.contains("Spring")){
                todoService.deleteTodo(todo);
            }
        }
    }
}
