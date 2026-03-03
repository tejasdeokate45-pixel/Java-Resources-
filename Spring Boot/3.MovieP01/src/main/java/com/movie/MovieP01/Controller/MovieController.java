package com.movie.MovieP01.Controller;

import com.movie.MovieP01.Model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {
    private List<Movie> mlist = new ArrayList<>();

    @GetMapping("get")
    public List<Movie> getMovie(){
        return mlist;
    }

    @PostMapping("add")
    public String addMovie(@RequestBody Movie movie){
        mlist.add(movie);
        return "Task Added Successfully ";
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody String Name){

        for(Movie m : mlist){
            if(m.getId().equals(id)){
                String oldName = m.getTitle();
                m.setTitle(Name);
                return "Old Title "+oldName+" New Title : "+Name;

            }
        }
        return "Invalid id : "+id;
    }
    @DeleteMapping("/remove/{name}")
    public String remove(@PathVariable String name) {
        // This line handles the loop and the removal safely in one step
        boolean wasRemoved = mlist.removeIf(m -> m.getTitle().equalsIgnoreCase(name));

        if (wasRemoved) {
            return name + " has been removed";
        }
        return "Invalid Name provided";
    }
}
