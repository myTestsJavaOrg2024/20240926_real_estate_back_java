package com.real_estate.backend.service;

import com.real_estate.backend.entity.PostEntity;
import com.real_estate.backend.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
//        todo 12: это нормально что сервис знает о сущьности,
//         не стоит ли знание о сущьности передать в репозиторий ?
        postEntity.setContent(testPost);
        postRepository.save(postEntity);
    }


    public List<PostEntity> findAll() {
        return postRepository.findAll();
    }

    public PostEntity findPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
}