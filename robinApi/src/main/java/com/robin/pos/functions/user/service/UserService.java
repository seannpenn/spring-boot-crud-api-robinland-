package com.robin.pos.functions.user.service;

import com.robin.pos.functions.user.dto.UserRequestDto;
import com.robin.pos.functions.user.repository.UserRepository;
import com.robin.pos.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long userId){
        return userRepository.findById(userId);
    }

    public User addUser(UserRequestDto requestDto){
        User user = new User();
        LocalDateTime dateTimeNow = LocalDateTime.now();
        BeanUtils.copyProperties(requestDto, user);

        user.setCreatedDate(dateTimeNow);
        user.setUpdatedDate(dateTimeNow);
        user.setCreatedBy("Seanpen");
        return userRepository.save(user);
    }
}
