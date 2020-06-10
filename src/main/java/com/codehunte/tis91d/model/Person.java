package com.codehunte.tis91d.model;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPerson")
    private int idPerson;
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;
    @Column(name = "lastName", columnDefinition = "varchar(50)")
    private String lastName;
    @Column(name = "age", columnDefinition = "int")
    private int age;

    public Person() {
    }

    public Person(int idPerson, String name, String lastName, int age) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
