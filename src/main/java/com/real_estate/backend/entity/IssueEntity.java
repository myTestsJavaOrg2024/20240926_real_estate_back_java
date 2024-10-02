package com.real_estate.backend.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "issue")
public class IssueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String text;
    private String issueKey;

    @ManyToOne
    @JoinColumn(name = "issue_type_id")
    private IssueTypeEntity issueTypeId;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity projectId;

    // Добавление иерархии (родительская связь)
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private IssueEntity parentIssueId;

    @OneToMany(mappedBy = "parentIssueId")
    private Set<IssueEntity> children;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(String issueKey) {
        this.issueKey = issueKey;
    }


    public IssueEntity getParentIssueId() {
        return parentIssueId;
    }

    public void setParentIssueId(IssueEntity parentIssueId) {
        this.parentIssueId = parentIssueId;
    }

    public Set<IssueEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<IssueEntity> children) {
        this.children = children;
    }

    public IssueTypeEntity getIssueTypeId() {
        return issueTypeId;
    }

    public void setIssueTypeId(IssueTypeEntity issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    public ProjectEntity getProjectId() {
        return projectId;
    }

    public void setProjectId(ProjectEntity projectId) {
        this.projectId = projectId;
    }
}
