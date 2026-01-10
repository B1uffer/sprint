package com.b1uffer;

import com.b1uffer.channel.entity.Channel;
import com.b1uffer.channel.service.BasicChannelService;
import com.b1uffer.channel.service.ChannelService;
import com.b1uffer.message.entity.Message;
import com.b1uffer.message.service.MessageService;
import com.b1uffer.message.service.basic.BasicMessageService;
import com.b1uffer.user.entity.User;
import com.b1uffer.user.service.UserService;
import com.b1uffer.user.service.basic.BasicUserService;

public class JavaApplication {
    public static void main(String[] args) {
        // user
        UserService userService = new BasicUserService();
        User user = userService.create("b1uffer", "1234", "description", "image");
        userService.read(user.getId());
        userService.update(user.getId(), "B1uffer", "5678", "sprint1", "newImage");
        userService.delete(user.getId());

        // channel
        ChannelService channelService = new BasicChannelService();
        Channel channel = channelService.create("publicChannel", "this is channel");
        channelService.read(channel.getId());
        channelService.update(channel.getId(), "updatedChannel", "updatedDescription");
        channelService.changeChannelTypePrivate(channel.getId(), false);
        channelService.changeChannelTypePublic(channel.getId(), true);
        channelService.delete(channel.getId());
        
        // message
        MessageService messageService = new BasicMessageService(userService);
        User messageUser = userService.create("messageUser", "1234", "description", "image");
        Message message = messageService.create("messageText", messageUser.getId());
        messageService.read(message.getId());
        messageService.update(messageUser.getId(), message.getId(), "updatedMessageText");
        messageService.delete(message.getId());
    }
}
