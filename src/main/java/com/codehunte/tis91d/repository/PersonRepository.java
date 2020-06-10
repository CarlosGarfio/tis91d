package com.codehunte.tis91d.repository;

import com.codehunte.tis91d.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}