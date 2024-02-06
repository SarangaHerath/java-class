package com.company.oop.encapsulation;

public class User {
    
    private int userId;
    private String name;
    private String email;
    private String password;
    
    public String saveUser(){
        return "user saved!!";
    }
    public String getUserById(int id){
        return "get all user success!!";
    }
    public String deleteUser(int id){
        return "user deleted!!";
    }

    public User() {
    }

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
