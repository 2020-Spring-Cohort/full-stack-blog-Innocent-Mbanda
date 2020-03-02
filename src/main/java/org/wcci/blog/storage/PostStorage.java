package org.wcci.blog.storage;

import org.wcci.blog.models.Post;

import java.util.Collection;
import java.util.Optional;

public interface PostStorage {

    Collection<Post>findAllPost();
    void store (Post post);
        Optional<Post> findPostById(Long id);

}
