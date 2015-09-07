package com.mjl.controller;

import com.mjl.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.ModalExclude;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jinglingmei on 15/9/7.
 */

//@Controller
//@RequestMapping("/test")
public class UserController {
        @Autowired
        IUserDao userMapper;
//        @RequestMapping("/login")
//        public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
//                String username=request.getParameter(username);
//                String password=request.getParameter(password);
//
//        }

}
