package org.wcci.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wcci.blog.models.Tag;
import org.wcci.blog.storage.TagStorage;

@Controller
@RequestMapping ("tag")
public class TagController {
    private TagStorage tagStorage;

    public TagController(TagStorage tagStorage) {
        this.tagStorage = tagStorage;
    }

    @GetMapping ("/{tagId}")

    public String displaySingleTag(@PathVariable Long tagId, Model model) {
        Tag retrievedTag = tagStorage.findTagById(tagId);
        model.addAttribute("tag",retrievedTag);
        return "tag";
    }

    @PostMapping ("add")
    public String AddTagForm(@RequestParam String tagName) {
        tagStorage.add(new Tag(tagName));
        return "direct:/tag/all-tags";

        }
        @GetMapping ("all-tags")
        public String ViewAllTags(Model model){
        model.addAttribute("tags",tagStorage.getAll());
        return "tags";

    }



}
