package org.wcci.blog.storage;

import org.wcci.blog.models.Category;

import java.util.Collection;

public interface CategoriesStorage {
    Collection<Category>getAll();

//    Collection<Category>findAllCategories();

    void store(Category category);

    Category findCategoryByName(String name);
    Category findCategoryById(long id);
}

