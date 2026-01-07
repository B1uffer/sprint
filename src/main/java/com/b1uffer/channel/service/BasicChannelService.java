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

    @Override
    public Channel read(UUID channelId) {
        if(channelRepository.get(channelId) == null) {
            throw new IllegalArgumentException("channel with id " + channelId + " not found!");
        }

        Channel channel = channelRepository.get(channelId);
        System.out.println("channel found! channel name : " + channel.getName());
        return channel;
    }

    @Override
    public Channel update(UUID channelId, String newName, String newDescription) {
        if(channelId == null) {
            throw new IllegalArgumentException("channelId cannot be null");
        }
        if(channelRepository.get(channelId) == null) {
            throw new IllegalArgumentException("channel with id " + channelId + " not found!");
        }

        Channel channel = channelRepository.get(channelId);

        if(newName == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        channel.setName(newName);
        channel.setDescription(newDescription);
        System.out.println("channel updated! channel name : " + channel.getName() + ", channel description : " + channel.getDescription());
        return channel;
    }

    @Override
    public void delete(UUID channelId) {
        if(channelId == null) {
            throw new IllegalArgumentException("channelId cannot be null");
        }
        if(channelRepository.get(channelId) == null) {
            throw new IllegalArgumentException("channel with id " + channelId + " not found!");
        }
        channelRepository.remove(channelId);
        System.out.println("channel deleted, channelId : " + channelId);
    }
}
