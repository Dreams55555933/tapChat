package com.fomihykh.tapChat.model;

import jakarta.persistence.Entity;


public class LoginChat {
    private Long phone;
    private String password;
    private String name;
    private Boolean isLogin;

    public void clear(){
        phone = null;
        password = null;
        name = null;
        isLogin = false;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsLogin(Boolean login) {
        isLogin = login;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }
}
