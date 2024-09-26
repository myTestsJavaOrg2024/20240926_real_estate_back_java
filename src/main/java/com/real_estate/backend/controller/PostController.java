package com.real_estate.backend.controller;

import com.real_estate.backend.service.PostServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    public PostController(PostServices postServices) {
        this.postServices = postServices;
    }

    private final PostServices postServices;

    @GetMapping("/testEndpoint")
    public String testController(){
        return postServices.postServices();
    }

    @PostMapping("/posts")
    public void postController(){
        postServices.createPost("test post");
    }
}