package com.real_estate.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "issue_type")
public class IssueTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
}
