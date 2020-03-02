package org.wcci.blog.models;


import javax.persistence.*;
import java.util.*;


@Entity
public class Post<date> {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String tag;
    @ManyToOne
    private Author author;
    private String datePublished;
   @ManyToOne
   private Category category;
    @ManyToMany (mappedBy = "post")
   private Collection<Tag> tags;
    public Post() {
    }
    public Post(Category category, String name, String author) {
        this.category = category;
        this.name = name;
    }

    public Post(Long id, String tag, Author author) {
        this.id = id;
        this.tag = tag;
        this.author = author;
    }


    public Object getAuthor() {
        return author;
    }

    public Object getCategory() {
        return category;
    }
}



