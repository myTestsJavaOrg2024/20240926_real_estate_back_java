package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String userName;

    @ManyToMany
    @JoinTable(
            name = "project_employee",  // Название промежуточной таблицы
            joinColumns = @JoinColumn(name = "project_id"),  // Внешний ключ для EmployeeEntity
            inverseJoinColumns = @JoinColumn(name = "employee_id")  // Внешний ключ для ProjectEntity
    )
    private Set<ProjectEntity> projects;
    //    todo - 9: картинки работа с s3 аватары и миниатюры


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Set<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(Set<ProjectEntity> projects) {
        this.projects = projects;
    }
}
