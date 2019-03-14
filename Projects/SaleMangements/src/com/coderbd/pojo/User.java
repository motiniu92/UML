package com.coderbd.pojo;

public class User {

    private int id;
    private String fullName;
    private String user;
    private String password;
    private String mobile;
    Role role;

    public User() {
    }

    public User(String fullName, String user, String password, String mobile, Role role) {
        this.fullName = fullName;
        this.user = user;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public User(int id, String fullName, String user, String password, String mobile, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.user = user;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName=" + fullName + ", user=" + user + ", password=" + password + ", mobile=" + mobile + ", role=" + role + '}';
    }

    public String getUserName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
