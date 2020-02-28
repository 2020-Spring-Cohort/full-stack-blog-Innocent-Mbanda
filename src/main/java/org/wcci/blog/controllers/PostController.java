package org.wcci.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.PostStorage;

public class PostController {
    private PostStorage postStorage;

    public PostController (PostStorage postStorage) { this.postStorage =postStorage; }

    @RequestMapping("/postpage/{id}")
    public String displayStringPost(@PathVariable long id, Model model){
        Post retrievedPost =PostStorage.findPostbyId(id);
        model.addAttribute("post",retrievedPost);
        return postpage

    }




}
