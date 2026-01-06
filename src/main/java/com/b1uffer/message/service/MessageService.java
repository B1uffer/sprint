package com.b1uffer.message.service;

import com.b1uffer.message.entity.Message;

import java.util.UUID;

public interface MessageService {
    Message create(String text, UUID userId);
    Message read(UUID messageId);
}
