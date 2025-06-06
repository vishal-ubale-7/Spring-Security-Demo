package com.learn.models;

public class User
{
    String username;
    String password;
    String email;

    // create no argument-constructor
    public User() {
    }

    // create constructor
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    // create setter and getter method
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

