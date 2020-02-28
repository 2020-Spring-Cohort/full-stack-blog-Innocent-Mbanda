package org.wcci.blog.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Calendar;
import java.util.Collection;
import java.util.Objects;


@Entity
public class Post {
    @Id
    @GeneratedValue
    private String postcontent;
    private String hastag;
    private String author;
    private int   Date;
    private Long id;
    private Calendar calendar;
    @ManyToMany
    private Collection<Author> authors;


    public Post(){}



    public Post(String postcontent, String hastag, String author) {

        this.postcontent = postcontent;
        this.hastag = hastag;
        this.author = author;
    }

    public String getPostcontent() {
        return postcontent;
    }

    public String getHastag() {
        return hastag;
    }

    public String getAuthor() {
        return author;
    }

    public Calendar getCalendar() {
        return calendar;
    }


    @Override
    public boolean equals(Objects o){
        if (this == o) return true;
        if (o == null|| getClass() != o. getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) &&
                Objects.equals(postcontent,post,postcontent) &&
                Objects.equals(hastag,post,hastag) &&
                Objects.equals(author,post,author);

    }

    @Override
    public int hashCode() {return Objects.hash(id, postcontent,hastag, author, calendar);}

}
