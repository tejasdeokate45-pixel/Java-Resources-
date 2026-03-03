package com.todo.todo_app.Controller;

import com.todo.todo_app.Model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private List<Task> tasks = new ArrayList();

    @GetMapping
    public List<Task> getAllTasks(){
        return tasks;
    }

    @PostMapping
    public String createTask(@RequestBody Task task){
        tasks.add(task);
        return "task Added Sucessfully !!";
    }

//    @PatchMapping
//    public
}
