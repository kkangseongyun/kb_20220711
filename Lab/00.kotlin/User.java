package com.kbstar.javaapp;

public class User {
    private String name;
    private String phone;
    private String role;

    public static final String ADMIN = "ADMIN";
    public static final String USER = "USER";

    public User(String name, String phone, String role){
        this.name = name;
        this.phone = phone;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
