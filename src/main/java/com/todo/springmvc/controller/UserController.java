package com.todo.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("get")
    public String getUser(){

        HashMap hashMap = new HashMap();
        hashMap.put("test" , "hello");

        System.out.printf("nihao" + hashMap);

        return "welcome";
    }
}
