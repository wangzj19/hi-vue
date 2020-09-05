package com.wzj.hivue.aspect.service;

import com.wzj.hivue.aspect.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User getUser(Long id);
    public List<User> findUsers(String userName, String note);
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(Long id);
}
