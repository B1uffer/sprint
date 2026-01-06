package com.b1uffer.message.entity;

import com.b1uffer.base.BaseEntity;
import com.b1uffer.user.entity.User;

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
     * 생성자
     */
    public Message(String text, User user) {
        id = UUID.randomUUID();
        createdAt = System.currentTimeMillis();
        this.text = text;
        this.user = user;
    }

    /**
     * getter
     */
    public UUID getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public User getUser() {
        return user;
    }

    /**
     * update 메서드(setter)
     */
    public void setText(String text) {
        this.text = text;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUpdatedAt() {
        updatedAt = System.currentTimeMillis();
    }
}
