package com.b1uffer.channel.service;

import com.b1uffer.channel.entity.Channel;

import java.util.UUID;

public interface ChannelService {
    Channel create(String name, String description);
    Channel read(UUID channelId);
}
