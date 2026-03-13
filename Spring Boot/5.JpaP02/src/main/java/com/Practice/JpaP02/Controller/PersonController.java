package com.Practice.JpaP02.Controller;

import com.Practice.JpaP02.Entity.Person;
import com.Practice.JpaP02.Repo.PersonRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Person")
public class PersonController {

    private final PersonRepo personRepo;


    public PersonController(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @GetMapping
    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }

    @PostMapping
    public Person addNewPerson(@RequestBody Person person){
        return personRepo.save(person);
    }

    @PutMapping
    public  Person updatePerson(@RequestParam Long id, @RequestBody Person person){
        Person p = personRepo.findById(id).get();
        p.setName(person.getName());
        p.setRoom(person.getRoom());
        return personRepo.save(p);
    }
    @PatchMapping
    public Person patchUpdate(@RequestParam Long id, @RequestBody Person person){
        Person p = personRepo.findById(id).get();

        if(person.getName() != null) {
            p.setName(person.getName());
        } else if (person.getRoom()!=null) {
            p.setRoom(person.getRoom());
        }
        return personRepo.save(p);
    }

    @DeleteMapping
    public void deletePerson(@RequestParam Long id){
        personRepo.deleteById(id);
    }
    

}
