package com.example.easynotes.services.impl;

import com.example.easynotes.mappers.UserMapper;
import com.example.easynotes.model.User;
import com.example.easynotes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.getUserList();
    }

    @Override
    public int create(User user) {
        return 0;
    }

    @Override
    public int update(Long id, User user) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        int count = userMapper.deleteByPrimaryKey(id);
        return count;
    }

    private void encryptPassword(User userInfo){
        String password = userInfo.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        userInfo.setPassword(password);
    }
}
