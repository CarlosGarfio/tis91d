package com.codehunte.tis91d.restcontrollers;

import com.codehunte.tis91d.model.Person;
import com.codehunte.tis91d.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRestController {

    @Autowired
    PersonService service;


    @GetMapping("/list")
    public List<Person> list() {
        return service.list();
    }

    @PostMapping("/add")
    public void add(@RequestBody Person person) {
        service.add(person);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Person person, @PathVariable int id) {
        service.update(person, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
