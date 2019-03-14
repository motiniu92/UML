package com.coderbd.dao;

import com.coderbd.pojo.Role;
import com.coderbd.pojo.User;
import java.util.List;

public interface UserDao {

    void createTable();

    void save(User user);

    void update(User user);

    Role getUserById(int id);

    Role getUserByUserName(String userName);

    void delete(int id);

    List<User> getUsers();
}
