package com.b1uffer.user.entity;

import com.b1uffer.base.BaseEntity;

import java.time.LocalDateTime;
import java.time.ZoneId;
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
     * 생성자
     */
    public User(String name, String password, String description, String image) {
        id = UUID.randomUUID();
        createdAt = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        this.name = name;
        this.password = password;
        this.description = description;
        this.image = image;
    }

    /**
     * getter
     */
    public UUID getId() {
        return id;
    }
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

    /**
     * update 함수 정의(setter)
     */
    public void updateName(String name) {
        this.name = name;
    }

    public void updatePassword(String password) {
        this.password = password;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void updateImage(String image) {
        this.image = image;
    }
}
