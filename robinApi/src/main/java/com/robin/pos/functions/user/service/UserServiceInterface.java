package com.robin.pos.functions.user.service;

import com.robin.pos.functions.user.dto.UserRequestDto;
import com.robin.pos.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserServiceInterface {

    public List<User> getAllUsers();

    public Optional<User> getUser(Long userId);

    public User addUser(UserRequestDto requestDto);
}
