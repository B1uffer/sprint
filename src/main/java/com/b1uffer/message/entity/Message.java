package com.b1uffer.message.entity;

import com.b1uffer.base.BaseEntity;
import com.b1uffer.user.entity.User;

import java.time.Instant;
import java.util.UUID;

public class Message extends BaseEntity {
    /**
     * 메시지 내용
     */
    private String text;

    /**
     * 메세지 쓴놈
     */
    private User user;

    /**
     * setter
     */
    public Message(UUID id, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Message(String text, User user) {
        this.text = text;
        this.user = user;
    }

    /**
     * getter
     */
    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }
}
