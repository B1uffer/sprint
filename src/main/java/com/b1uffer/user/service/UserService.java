package com.b1uffer.user.service;

import com.b1uffer.user.entity.User;

import java.util.UUID;

public interface UserService {
    User create(String name, String password, String description, String image);
    User read(UUID userId);
    User update(UUID userId, String name, String password, String description, String image);
    void delete(UUID userId);
    User getUser(UUID userId);
}
