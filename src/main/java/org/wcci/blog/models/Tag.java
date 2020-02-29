package org.wcci.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany (mappedBy = "tags")
    private Collection<Author> authors;


    protected Tag(){}
    public Tag(String name){
        authors = new ArrayList<>();
        this.name =name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return id == tag.id &&
                Objects.equals(name, tag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authors);
    }
}



