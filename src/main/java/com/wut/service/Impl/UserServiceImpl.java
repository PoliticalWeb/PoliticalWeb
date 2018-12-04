package com.wut.service.Impl;

import com.wut.dao.UserDao;
import com.wut.model.User;
import com.wut.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by liufukai on 2018/12/3.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User getNameById(User user){
        return userDao.getNameById(user);
    }
    @Override
    public boolean addUser(){
        boolean result=false;
        try {
            userDao.addUser();
            result=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public User getUserById(int id){
        return userDao.selectUserById(id);
    }
}
