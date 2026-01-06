package com.b1uffer.message.service.basic;

import com.b1uffer.message.entity.Message;
import com.b1uffer.message.service.MessageService;
import com.b1uffer.user.entity.User;
import com.b1uffer.user.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BasicMessageService implements MessageService {
    private final Map<UUID, Message> messageRepository = new HashMap<>();
    private final UserService userService;

    public BasicMessageService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Message create(String text, UUID userId) {
        if(text == null) {
            return null;
        }

        User user = userService.getUser(userId);
        if(user == null) {
            throw new IllegalArgumentException("Something was wrong with the user");
        }
        Message message = new Message(text, user);
        messageRepository.put(message.getId(), message);
        return message;
    }
}
