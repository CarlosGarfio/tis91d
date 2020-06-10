package com.codehunte.tis91d.services;

import com.codehunte.tis91d.model.Person;
import com.codehunte.tis91d.repository.CRUD;
import com.codehunte.tis91d.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService extends CRUD<Person, PersonRepository> {

    public PersonService(PersonRepository repository) {
        super(repository);
    }

    @Override
    public List<Person> list() {
        return repository.findAll();
    }

    @Override
    public Person get(int id) {
        return null;
    }

    @Override
    public void add(Person o) {
        repository.save(o);

    }

    @Override
    public void update(Person o, int id) {
        Person p = new Person(
                id,
                o.getName(),
                o.getLastName(),
                o.getAge()
        );

        repository.save(p);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
