package com.example.h2zoo.model;/*
 * Package: com.example.h2zoo.model
 * File:    Mammals
 * Author:  chadeckles
 * Date:    6/14/21, 11:20 AM
 * Project: h2-zoo
 * Package: com.example.h2zoo.model
 * Info   :
 *
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mammals {
    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String species;
    private final String color;
    private final String dietType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getDietType() {
        return dietType;
    }

    public Mammals(String name, String species, String color, String dietType){
        this.name = name;
        this.species = species;
        this.color = color;
        this.dietType = dietType;
    }
}
