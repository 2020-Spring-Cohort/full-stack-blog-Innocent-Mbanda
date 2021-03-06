package org.wcci.blog.storage;

import org.wcci.blog.models.Tag;

import java.util.Collection;

public interface TagStorage {
    Collection<Tag> getAll();

        void add (Tag tag);
        Tag findTagByName(String name);

        Tag findTagById(long id);
    }

