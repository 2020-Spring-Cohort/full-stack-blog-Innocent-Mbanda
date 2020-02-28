package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.models.Category;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.CategoryStorage;
import org.wcci.blog.storage.PostStorage;

@Controller

public class CategoryController {
    private final CategoryStorage categoryStorage;
    public CategoryController(CategoryStorage categoryStorage, AuthorStorage authorStorage,PostStorage postStorage){
        this.categoryStorage =categoryStorage;

    }

    @RequestMapping ({"/category", "/",""})
    public String displaycategories(Model model){
        model.addAttribute("Categories",categoryStorage.findAllCategories());
        return categoriesView;

        }

        @RequestMapping ("/category/{categoriesName}")
        public String displaySingleCategory(@PathVariable String categoriesName, Model model){
            Category retrievedCategory = categoryStorage.findCategoriesByname("");
            model.addAttribute("category",retrievedCategory);
            return Post;
        }


    }









