package com.mjl.service;

import org.springframework.ui.Model;

/**
 * Created by alvin on 15/9/7.
 */
public interface UserService {
    public boolean login(String username,String password);
}
