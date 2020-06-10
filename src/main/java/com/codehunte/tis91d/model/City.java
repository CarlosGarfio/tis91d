package com.codehunte.tis91d.model;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCity")
    private int idCity;
    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;

    public City() {
    }

    public City(int idCity, String name) {
        this.idCity = idCity;
        this.name = name;
    }

    public int getIdCity() {
        return idCity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "idCity=" + idCity +
                ", name='" + name + '\'' +
                '}';
    }
}
