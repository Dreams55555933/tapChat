package com.fomihykh.tapChat.controller;

import com.fomihykh.tapChat.model.LoginChat;
import com.fomihykh.tapChat.model.UserChat;
import com.fomihykh.tapChat.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping
    public LoginChat login(@RequestBody LoginChat loginChat){

        List <UserChat> users = userService.getAllUser();
        for (UserChat user:users){
            if (user.getPhone()==loginChat.getPhone()){
                if (Objects.equals(user.getPassword(), loginChat.getPassword())){
                    loginChat.setIsLogin(true);
                    loginChat.setName(user.getName());
                    return loginChat;
                }
            }
        }
        loginChat.clear();
        return loginChat;
    }
}

