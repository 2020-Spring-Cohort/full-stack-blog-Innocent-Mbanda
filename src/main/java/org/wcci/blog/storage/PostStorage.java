package org.wcci.blog.storage;

import org.wcci.blog.models.Category;
import org.wcci.blog.models.Post;

import java.util.Collection;

public interface PostStorage {

    Collection<Post>findAllCategories();
    void store (Post post);
        Post findPostById(Long id);

}
