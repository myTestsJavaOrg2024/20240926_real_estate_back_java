package com.real_estate.backend.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String firstName;
    private String lastName;
    //    todo - 9: картинки работа с s3 аватары и миниатюры

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<PostEntity> posts;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PostEntity> getPosts() {
        return posts;
    }

    public void setPosts(List<PostEntity> posts) {
//        todo - 2 как организовать этот метод лучше
//        todo - 3 как реализовать сериализованное представление
//        todo - 4 рассказать про проблемму N + 1
        this.posts = posts;
    }
}
