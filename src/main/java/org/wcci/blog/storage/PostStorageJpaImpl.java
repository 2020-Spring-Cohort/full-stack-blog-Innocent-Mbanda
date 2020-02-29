package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.models.Post;

import java.util.Collection;

@Service
public class PostStorageJpaImpl implements PostStorage {

    @Override
    public Collection<Post> findAllCategories() {
        return null;
    }

    @Override
    public void store(Post post) {

    }

    @Override
    public Post findPostById(Long id) {
        return null;
    }
}
