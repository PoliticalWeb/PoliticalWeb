package com.wut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liufukai on 2018/11/14.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }
}
