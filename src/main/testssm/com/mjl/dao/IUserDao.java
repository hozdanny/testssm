package com.mjl.dao;

import com.mjl.model.User;

/**
 * Created by jinglingmei on 15/9/7.
 * 此类为接口模式下的配置
 */
public interface IUserDao {
    public User selectById(int id);
    public User selectByName(String username);
}
