package org.wcci.blog.storage;


import org.springframework.stereotype.Service;
import org.wcci.blog.models.Author;
import org.wcci.blog.storage.repositories.AuthorRepository;

import java.util.Collection;


@Service
public class AuthorStorageJpaImpl implements AuthorStorage {
    private final AuthorRepository authorRepository;

    public AuthorStorageJpaImpl(AuthorRepository authorRepository)
    {
        this.authorRepository = authorRepository;
    }

    @Override
    public Collection<Author> getAll() {
            return(Collection<Author>) authorRepository.findAll();
    }

    @Override
    public void store(Author author) {
//        authorRepository.save(authorToStore);
    }

//    @Override
//    public Author findAuthorByName(String name) {
//        return null;
//    }

//    @Override
//    public Author findAuthorById (long autheorid) {
//        return authorRepository.findAuthorById(autheorid).get();
//    }

    @Override
    public Author findAuthorById(Long authorId) {
        return authorRepository.findById(authorId).get();
    }


}




