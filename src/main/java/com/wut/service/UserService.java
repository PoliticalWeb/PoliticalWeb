package com.wut.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.wut.model.User;

/**
 * Created by liufukai on 2018/12/3.
 */
public interface UserService {
    public User getNameById(User user);
    boolean addUser();
    public User getUserById(int id);
}
