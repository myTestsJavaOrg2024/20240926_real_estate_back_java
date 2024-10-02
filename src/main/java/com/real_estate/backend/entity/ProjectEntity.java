package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "project")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "project_employee",  // Название промежуточной таблицы
            joinColumns = @JoinColumn(name = "employee_id"),  // Внешний ключ для EmployeeEntity
            inverseJoinColumns = @JoinColumn(name = "project_id")  // Внешний ключ для ProjectEntity
    )
    private Set<EmployeeEntity> employees;
}
