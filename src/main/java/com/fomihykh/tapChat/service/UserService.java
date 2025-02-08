package com.fomihykh.tapChat.service;

import com.fomihykh.tapChat.model.UserChat;
import com.fomihykh.tapChat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserChat> getAllUser(){
        return userRepository.findAll();
    }
    public Optional<UserChat>getUserById(Long id){
        return userRepository.findById(id);
    }
    public UserChat createUser(UserChat newUserChat){
        return userRepository.save(newUserChat);
    }
    public UserChat updateUser(Long id, UserChat userChatDetails){
        UserChat userChat = userRepository.findById(id).orElseThrow(()->
                new RuntimeException("User not found"));
        userChat.setPhone(userChat.getPhone());
        userChat.setName(userChat.getName());
        userChat.setPassword(userChat.getPassword());
        return userRepository.save(userChat);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}

