package com.wut.dao;

import com.wut.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by liufukai on 2018/12/3.
 */
@Mapper
public interface UserDao {
    public User getNameById(User user);
    public boolean addUser();
    User selectUserById(Integer id);
}
