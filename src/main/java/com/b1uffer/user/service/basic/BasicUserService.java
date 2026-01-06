package com.b1uffer.user.service.basic;

import com.b1uffer.user.entity.User;
import com.b1uffer.user.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BasicUserService implements UserService {
    private final Map<UUID, User> userRepository = new HashMap<>();

    @Override
    public User create(String name, String password, String description, String image) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if(password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }

        if(description.isEmpty()) {
            description = "default description";
        }

        if(image == null) {
            image = "default image";
        }

        User user = new User(name, password, description, image);
        userRepository.put(user.getId(), user);

        return user;
    }

    @Override
    public User read(UUID userId) {

        if(userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }

        User user = userRepository.get(userId);
        return user;
    }

    @Override
    public User update(UUID userId, String name, String password, String description, String image) {
        User user = userRepository.get(userId);

        if(name == null) {
            name = user.getName();
        }
        user.updateName(name);

        if(password == null) {
            password = user.getPassword();
        }
        user.updatePassword(password);

        if(description == null) {
            description = user.getDescription();
        }
        user.updateDescription(description);

        if(image == null) {
            image = user.getImage();
        }
        user.updateImage(image);

        user.setUpdatedAt();

        return user;
    }

    @Override
    public void delete(UUID userId) {
        if(userId == null) {
            throw new IllegalArgumentException("userId cannot be null");
        }
        userRepository.remove(userId);
    }
}
