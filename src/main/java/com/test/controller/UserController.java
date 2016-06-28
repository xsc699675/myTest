package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2016/5/17.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String userIndex(ModelMap modelMap,@RequestParam("userName") String userName,@RequestParam("age") int age){
        User user=new User();
        user.setUserName(userName);
        user.setAge(age);
        userService.addUser(user);
        return "index";
    }
}
