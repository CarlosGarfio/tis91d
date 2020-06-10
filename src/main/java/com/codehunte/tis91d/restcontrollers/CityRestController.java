package com.codehunte.tis91d.restcontrollers;

import com.codehunte.tis91d.model.City;
import com.codehunte.tis91d.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityRestController {

    @Autowired
    CityService service;

    @GetMapping("/list")
    public List<City> list() {
        return service.list();
    }

    @PostMapping("/add")
    public void add(@RequestBody City city) {
        service.add(city);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody City city, @PathVariable int id) {
        service.update(city, id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
