package com.git.studygittmp.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="bin")
public class BIN {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long number;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private int sid;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
