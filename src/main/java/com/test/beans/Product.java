package com.test.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String imagepath;

    public Product() {
    }

    public Product(String name, String imagepath) {
        this.name = name;
        this.imagepath = imagepath;
    }
}
