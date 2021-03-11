package com.example.easynotes.services;

import com.example.easynotes.model.User;

import java.util.List;

public interface UserService {
    /**
     * create users
     */
    int create(User user);
    /**
     * update user
     */
    int update(Long id, User user);
    /**
     * delete users
     */
    int delete(Long id);

    /**
     * find all users
     */
    List<User> findAll();
}
