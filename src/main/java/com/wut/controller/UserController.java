package com.wut.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wut.model.User;
import com.wut.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liufukai on 2018/12/3.
 */
@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String index(){
        return "Hello User";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(User user){
        User u=userService.getNameById(user);
        return JSONObject.toJSONString(u);
    }
    @RequestMapping("/add")
    @ResponseBody
    public String add(){
        userService.addUser();
        return "Success";
    }
    @RequestMapping("/showUser")
    @ResponseBody
    public User getById(HttpServletRequest request, Model model){
        int userId=Integer.parseInt(request.getParameter("id"));
        User user=userService.getUserById(userId);
        return user;
    }
}
