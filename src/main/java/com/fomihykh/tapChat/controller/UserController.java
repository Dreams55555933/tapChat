package com.fomihykh.tapChat.controller;

import com.fomihykh.tapChat.model.UserChat;
import com.fomihykh.tapChat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserChat>getAllUsers(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public Optional<UserChat> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @PostMapping
    public UserChat createUser(@RequestBody UserChat newUserChat){
        return userService.createUser(newUserChat);
    }
    @PutMapping("/{id}")
    public UserChat updateUser(@PathVariable Long id, @RequestBody UserChat detailUserChat){
        return userService.updateUser(id, detailUserChat);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}
