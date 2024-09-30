package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Scanner;

@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "employee_id") // Внешний ключ для связи с EmployeeEntity
    private EmployeeEntity employee;
    //   todo - 7: как избежать конфликта, при добавлении ненулевых полей. Миграции в  spring
    //   todo - 8: воркфлоу с работой бд на продакшн, как это делать в больших проектах.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }
}
