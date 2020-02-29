package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.models.Category;
import org.wcci.blog.storage.CategoriesStorage;

@Controller
public class CategoriesController {
    private CategoriesStorage categoriesStorage;

    public CategoriesController(CategoriesStorage categoriesStorage) {
        this.categoriesStorage = categoriesStorage;
    }


    @RequestMapping ("/categories")
    public String displayCategories(Model model){
        model.addAttribute("categories", categoriesStorage.findAllCategories());
        return "categoriesView";

        }

        @RequestMapping ("/category/{categoriesName}")
        public String displaySingleCategory(@PathVariable String categoriesName, Model model){
            Category retrievedCategory = categoriesStorage.findCategoryByName(categoriesName);
            model.addAttribute("category",retrievedCategory);
            return categoriesName;
        }


    }









