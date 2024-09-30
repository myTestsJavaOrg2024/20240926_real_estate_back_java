package com.real_estate.backend.controller;

import com.real_estate.backend.entity.PostEntity;
import com.real_estate.backend.service.PostServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    public PostController(PostServices postServices) {
        this.postServices = postServices;
    }

    private final PostServices postServices;

    @GetMapping("/posts")
    public List<PostEntity> findAll() {
        return postServices.findAll();
    }

    @GetMapping("/posts/")
    public PostEntity findById(@RequestParam Long id) {
       return postServices.findPostById(id);
    }

    @PostMapping("/posts")
    public void postController(@RequestBody String content){
        // todo - 1: как сделать именованный параметр в свагер. Настрйока request body параметров
        postServices.createPost(content);
    }
}