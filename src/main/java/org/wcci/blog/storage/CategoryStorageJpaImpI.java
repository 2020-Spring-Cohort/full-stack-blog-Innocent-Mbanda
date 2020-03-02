package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.models.Category;
import org.wcci.blog.storage.repositories.CategoryRepository;

import java.util.Collection;

@Service
public class CategoryStorageJpaImpI implements CategoriesStorage {
    private final CategoryRepository categoryRepository;

    public CategoryStorageJpaImpI(CategoryRepository categoryRepository) {
        this.categoryRepository =categoryRepository;
    }


    @Override
    public Collection<Category> getAll() {
        return (Collection<Category>) categoryRepository.findAll();
    }

    @Override
    public void store(Category category) {

        categoryRepository.save(category);

    }

    @Override
    public Category findCategoryByName(String name) {

        return categoryRepository.findByName(name).get();

    }

    @Override
    public Category findCategoryById(long id) {
        return categoryRepository.findById(id).get();
    }
}

