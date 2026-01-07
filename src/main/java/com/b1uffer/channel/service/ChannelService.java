package com.b1uffer.channel.service;

import com.b1uffer.channel.entity.Channel;

import java.util.UUID;

public interface ChannelService {
    Channel create(String name, String description);
    Channel read(UUID channelId);
    Channel update(UUID channelId, String newName, String newDescription);
    void delete(UUID channelId);
    Channel changeChannelTypePrivate(UUID channelId, boolean isPublic);
    Channel changeChannelTypePublic(UUID channelId, boolean isPublic);
}
