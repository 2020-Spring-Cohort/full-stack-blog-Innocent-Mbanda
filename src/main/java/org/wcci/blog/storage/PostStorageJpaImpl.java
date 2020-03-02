package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.repositories.AuthorRepository;
import org.wcci.blog.storage.repositories.CategoryRepository;
import org.wcci.blog.storage.repositories.PostRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class PostStorageJpaImpl implements PostStorage {

    private PostRepository postRepository;
    private AuthorRepository authorRepository;
    private CategoryRepository categoryRepository;

    public PostStorageJpaImpl(PostRepository postRepository, AuthorRepository authorRepository, CategoryRepository categoryRepository) {
        this.postRepository = postRepository;
        this.authorRepository = authorRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Collection<Post> findAllPost() {
        return (Collection<Post>) postRepository.findAll();
    }

    @Override
    public void store(Post postToStore) {


    }

    @Override
    public Optional<Post> findPostById(Long id) {
        return postRepository.findPostById(id) ;
    }
}
