package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.models.Category;

import java.util.Collection;

@Service
public class CategoryStorageJpaImpI implements CategoriesStorage {
    @Override
    public Collection<Category> findAllCategories() {
        return null;
    }

    @Override
    public void store(Category category) {

    }

    @Override
    public Category findCategoryByName(String categoryName) {
        return null;
    }
}
