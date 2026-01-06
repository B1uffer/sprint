package com.b1uffer.user.entity;

import com.b1uffer.base.BaseEntity;

import java.util.UUID;

public class User extends BaseEntity {
    /**
     * 이름
     */
    private String name;

    /**
     * 비밀번호
     */
    private String password;

    /**
     * 설명
     */
    private String description;

    /**
     * 이미지
     */
    private String image;

    /**
     * setter to BaseEntity
     */
    public User(UUID id, Long createdAt, Long updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * setter
     */
    public User(String name, String password, String description, String image) {
        this.name = name;
        this.password = password;
        this.description = description;
        this.image = image;
    }

    /**
     * getter
     */
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
