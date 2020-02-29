package org.wcci.blog.models;


import javax.persistence.*;
import java.util.*;


@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String tag;
    private String author;
    private int Date;
    private Calendar calendar;
    @ManyToMany
    private Collection<Author> authors;
    @ManyToOne
    private Category category;
    private String title;
    @ManyToMany
    private Set<Tag> Tag;

    public Post(String title, String name, Tag tag, Id id, Author author, Calendar calendar) {


        this.title = title;
        this.authors = new ArrayList<Author>(Arrays.<Author>asList());
        this.name = name;
        this.Tag = new HashSet<>();

    }
  public Post (){}

    public Set<Tag> getTag() {
        return Tag;
    }

    public void setTag(Set<Tag> tag) {
        Tag = tag;
    }
}