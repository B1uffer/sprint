package com.b1uffer.channel.service;

import com.b1uffer.channel.entity.Channel;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BasicChannelService implements ChannelService {
    private final Map<UUID, Channel> channelRepository = new HashMap<>();

    @Override
    public Channel create(String name, String description) {
        if(name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if(description == null) {
            description = "this is " + name + "channel!";
        }

        Channel channel = new Channel(name, description);
        channelRepository.put(channel.getId(), channel);
        return channel;
    }
}
