package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.wcci.blog.models.Category;

import java.util.Optional;

@Service
public interface CategoryRepository extends CrudRepository <Category, Long>  {
    Optional<Category> findById(Long id);
}
