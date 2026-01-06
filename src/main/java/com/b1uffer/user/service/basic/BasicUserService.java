package com.b1uffer.user.service.basic;

import com.b1uffer.user.entity.User;
import com.b1uffer.user.service.UserService;

import java.util.UUID;

public class BasicUserService implements UserService {
    @Override
    public User create(String name, String password, String description, String image) {
        return null;
    }

    @Override
    public User read(UUID userId) {
        return null;
    }

    @Override
    public User update(String name, String password, String description, String image) {
        return null;
    }

    @Override
    public void delete(UUID userId) {

    }
}
