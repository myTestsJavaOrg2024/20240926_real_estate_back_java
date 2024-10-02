package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "worklog")
public class WorklogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Date startedDate;
    private Long timeSpentSeconds;

    // Связь с IssueEntity
    @ManyToOne
    @JoinColumn(name = "issue_id")  // Внешний ключ на таблицу issue
    private IssueEntity issue;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
