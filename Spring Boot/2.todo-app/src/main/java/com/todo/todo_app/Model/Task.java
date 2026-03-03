package com.todo.todo_app.Model;

public class Task {
    private Long id;
    private String description;
    private boolean isCompleted;

    public Task(){

    }
    public Task(String description, Long id, boolean isCompleted) {
        this.description = description;
        this.id = id;
        this.isCompleted = isCompleted;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
