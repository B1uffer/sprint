package com.b1uffer.channel.service;

import com.b1uffer.channel.entity.Channel;

public interface ChannelService {
    Channel create(String name, String description);
}
