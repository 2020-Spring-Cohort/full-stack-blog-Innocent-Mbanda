package org.wcci.blog.controllers;

import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;
import org.wcci.blog.models.Author;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.PostStorage;
import org.wcci.blog.storage.repositories.PostRepository;

@Controller
@RequestMapping("Author")
public class AuthorController{
    private AuthorStorage authorStorage;
    private PostStorage postStorage;


    public AuthorController (AuthorStorage authorStorage){ this.authorStorage =authorStorage;}

    @GetMapping ("/{authorId}")

    public String displayAuthorFromPostPage(@PathVariable Long authorId, Model model) {
        Author retrievedAuthor =authorStorage.findAuthorById(authorId);
        model.addAttribute("author", retrievedAuthor);
        return "author";
    }

    }




