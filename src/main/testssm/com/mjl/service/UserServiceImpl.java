package com.mjl.service;

import com.mjl.dao.IUserDao;
import com.mjl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by jinglingmei on 15/9/7.
 */
@Service("UserService")
@Scope("prototype")
public class UserServiceImpl implements UserService {
    @Autowired
    IUserDao Mapper;


    public boolean login(String username, String password) {
//        System.out.println("输入的账号:" + username + "输入的密码:" + password);
        User user = Mapper.selectByName(username);
        if (user != null) {
//            System.out.println("查询出来的账号:" + user.getUsername() + "密码:" + user.getPassword());
//            System.out.println("---------");
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                return true;

        }
        return false;

    }
}