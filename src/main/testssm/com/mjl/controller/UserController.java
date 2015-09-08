package com.mjl.controller;

import com.mjl.dao.IUserDao;
import com.mjl.model.User;
import com.mjl.service.UserService;
import com.mjl.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by jinglingmei on 15/9/7.
 */

@Controller
@RequestMapping("/user")
@Scope("prototype")
public class UserController {
    @Autowired
        UserServiceImpl userService;

//    public UserServiceImpl getUserService() {
//        return userService;
//    }
//    @Autowired
//    public void setUserService(UserServiceImpl userService) {
//        this.userService = userService;
//    }

    @RequestMapping("/login")
       public String login(User user,HttpServletRequest request){
        boolean loginType = userService.login(user.getUsername(),user.getPassword());
        if(loginType){
            request.setAttribute("user",user);
            return "success";
        }else{
            request.setAttribute("message","用户名密码错误");
            return "fail";
        }
    }

}
