package org.wcci.blog.models;

import org.thymeleaf.expression.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private String post;
    private String name;
    private long id;

//    @oneToMany(
//            mappedby ="category")
//
//   private Collections<post> posts;{
//
//
 public Category (String name){
     this.post = name;
 }

 public Category(){

 }

    public String getPost() {
        return post;
    }

    public String getName() {
        return name;
    }

    public Category(String post, String name) {
     this.post = post;
     this.name = name;
    }

//    @Override
//    public boolean equals (Object O) {
//     if (this == O) return true;
//     if (O == null || getClass()  != O .getClass()) return false;
//     Category category = (Category) O;
//     return Objects.equals ( post, category.name);
//
//
//    }
}
