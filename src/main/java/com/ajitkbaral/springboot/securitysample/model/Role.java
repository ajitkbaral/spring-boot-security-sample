package com.ajitkbaral.springboot.securitysample.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rollId;
    @Column(name = "role")
    private String role;

    public Role() {
    }

    public Role(Integer rollId, String role) {
        this.rollId = rollId;
        this.role = role;
    }

    public Integer getRollId() {
        return rollId;
    }

    public void setRollId(Integer rollId) {
        this.rollId = rollId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rollId=" + rollId +
                ", role='" + role + '\'' +
                '}';
    }
}
