package com.test.controller;

import com.alibaba.fastjson.JSON;
import com.test.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Home {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/getAll")
    @ResponseBody
    public String getAllUserInfo(){
        return JSON.toJSONString(userInfoService.getUser());    }

    @RequestMapping("/index")
    @ResponseBody
    public String greet(){
        return  "hello";
    }

//    @GetMapping("/testPost")
//    @ResponseBody
//    public String getSomeOne(@RequestParam("id") int id){
//        userInfoService
//
//    }
}
