package com.b1uffer.user.entity;

import com.b1uffer.base.BaseEntity;

import java.time.Instant;
import java.util.UUID;

public class User extends BaseEntity {
    // 이름
    private String name;

    // 비밀번호
    private String password;

    // 설명
    private String description;

    public User(UUID id, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
