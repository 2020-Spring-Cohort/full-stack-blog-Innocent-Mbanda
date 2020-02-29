package org.wcci.blog.models;

import org.thymeleaf.expression.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {


    @Id
    @GeneratedValue
    private Long id;
    private String name;


//    @oneToMany(
//            mappedby ="category")
//
//   private Collections<post> posts;{
//
//
public Category (String name) {
    this.name = name;
}

 public Category(){

 }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }




}
