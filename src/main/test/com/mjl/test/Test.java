package com.mjl.test;

import com.mjl.dao.IUserDao;


import com.mjl.model.User;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by jinglingmei on 15/9/6.
 */
public class Test {
   private static ApplicationContext ac;
    static {
        ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    public static void main(String[] args) {
        IUserDao mapper = (IUserDao) ac.getBean("IUserDao");
        System.out.println("获取alvin");
        User user = mapper.selectByName("alvin");

        System.out.println(user.getId()+":"+"username:"+user.getUsername());

    }
}
