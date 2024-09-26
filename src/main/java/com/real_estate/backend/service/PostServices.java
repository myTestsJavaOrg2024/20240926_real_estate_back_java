package com.real_estate.backend.service;

import com.real_estate.backend.entity.PostEntity;
import com.real_estate.backend.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServices {
    private final PostRepository postRepository;

    public PostServices(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public String postServices() {
        return "Post Services is working!";
    }

    public void createPost(String testPost) {
        PostEntity postEntity = new PostEntity();
        postEntity.setContent(testPost);
        postRepository.save(postEntity);
    }
}