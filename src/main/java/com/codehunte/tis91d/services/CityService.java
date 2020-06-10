package com.codehunte.tis91d.services;

import com.codehunte.tis91d.model.City;
import com.codehunte.tis91d.repository.CRUD;
import com.codehunte.tis91d.repository.CityRepository;
import com.codehunte.tis91d.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService extends CRUD<City, CityRepository> {

    public CityService(CityRepository repository) {
        super(repository);
    }

    @Override
    public List<City> list() {
        return repository.findAll();
    }

    @Override
    public City get(int id) {
        return null;
    }

    @Override
    public void add(City o) {
        repository.save(o);

    }

    @Override
    public void update(City o, int id) {
        City c = new City(
                id,
                o.getName()
        );
        repository.save(c);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
