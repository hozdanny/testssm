package com.mjl.dao;

import com.mjl.model.User;

/**
 * Created by alvin on 15/9/7.
 * 此类为接口模式下的配置
 */

public interface IUserDao {
    //这里以接口形式定义了数据库操作方法,我们只需
    // 在Mybatis映射文件中对其进行映射就可以直接使用
    public User selectById(int id);
    public User selectByName(String username);
}
