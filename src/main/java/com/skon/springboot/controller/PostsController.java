package com.skon.springboot.controller;

import com.skon.springboot.dao.PostRepo;
import com.skon.springboot.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostsController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping("/posts")
    public String getPosts(Model model) {

        Iterable<Post> posts = postRepo.findAll();

        model.addAttribute("posts", posts);
        return "hello";
    }

    @PostMapping("/posts")
    public String savePost(@RequestParam String title, @RequestParam String text, Model model) {
        Post post = new Post(title, text);

        postRepo.save(post);

        Iterable<Post> posts = postRepo.findAll();
        model.addAttribute("posts", posts);

        return "hello";
    }
}
