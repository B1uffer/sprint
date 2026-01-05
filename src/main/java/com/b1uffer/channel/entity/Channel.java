package com.b1uffer.channel.entity;

import com.b1uffer.base.BaseEntity;

import java.time.Instant;
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
     * 공개채널, 비밀채널
     * true이면 public
     */
    private boolean isPublic;

    public Channel(UUID id, Instant createdAt, Instant updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Channel(String name, String description, boolean isPublic) {
        this.name = name;
        this.description = description;
        this.isPublic = isPublic;
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
}
