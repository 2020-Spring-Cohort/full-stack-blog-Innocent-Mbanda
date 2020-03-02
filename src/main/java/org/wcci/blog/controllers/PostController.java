package org.wcci.blog.controllers;

import com.sun.xml.bind.v2.runtime.unmarshaller.TagName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.model.IAttribute;
import org.wcci.blog.models.Category;
import org.wcci.blog.models.Post;
import org.wcci.blog.models.Tag;
import org.wcci.blog.storage.PostStorage;
import org.wcci.blog.storage.repositories.CategoryRepository;
import org.wcci.blog.storage.repositories.PostRepository;
import org.wcci.blog.storage.repositories.TagRepository;

import javax.persistence.Id;
import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class PostController {
    private final PostStorage postStorage;
//    private TagRepository tagRepository;
    private PostRepository postRepository;

    public PostController(PostStorage postStorage, PostRepository postRepository) {
        this.postStorage = postStorage;
        this.postRepository = postRepository;
    }

    @RequestMapping ("/post/{id}")
    public String displayPosts(@PathVariable Long id, Model model){
        Optional<Post> retrievedPost =postStorage.findPostById(id);
        model.addAttribute("post", retrievedPost);
        return "post";

    }


//
//    @PostMapping("/post/{id}/add-Tags")
//    public String addTagsToPost(@RequestParam String tagName, @PathVariable Long id){
//        Tag tagsToAddToPost;
//        Optional <Tag>  tagToAddOpt =tagRepository.findByName(tagName);
//        if (tagToAddOpt.isEmpty()) {
//            tagsToAddToPost = new Tag (tagName);
//
//
//
//        } else {
//            tagsToAddToPost =tagToAddOpt.get();
//
//        }
//        return tagName;
//


    }





