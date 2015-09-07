package com.mjl.service;

import com.mjl.dao.IUserDao;
import com.mjl.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by jinglingmei on 15/9/7.
 */
@Service("UserService")
public class UserServiceImpl implements UserService{
    IUserDao Mapper;
    public boolean login(String username, String password) {
        User user = Mapper.selectByName(username);
        if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
