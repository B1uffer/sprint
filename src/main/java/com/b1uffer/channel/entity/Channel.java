package com.b1uffer.channel.entity;

import com.b1uffer.base.BaseEntity;
import com.b1uffer.user.entity.User;

import java.util.List;
import java.util.UUID;

public class Channel extends BaseEntity {
    /**
     * 채널명
     */
    private String name;

    /**
     * 설명
     */
    private String description;

    /**
     * 사용자 리스트, 작업중
     */
    private List<User> users;

    /**
     * 공개채널, 비밀채널
     * true이면 public
     */
    private boolean isPublic;

    /**
     * 생성자
     */
    public Channel(String name, String description) {
        id = UUID.randomUUID();
        createdAt = System.currentTimeMillis();
        this.name = name;
        this.description = description;
        this.isPublic = true;
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

    public String getDescription() {
        return description;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    /**
     * update 메서드(setter)
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public void setUpdatedAt() {
        this.updatedAt = System.currentTimeMillis();
    }
}
