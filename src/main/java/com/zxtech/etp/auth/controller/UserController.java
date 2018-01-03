package com.zxtech.etp.auth.controller;

import com.zxtech.etp.auth.pojo.User;
import com.zxtech.etp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public ModelAndView findUser() throws Exception{
        ModelAndView modelandview = new ModelAndView();
        List<User> users = userService.findUser();
        modelandview.addObject("users", users);

        modelandview.setViewName("findUser");
        return modelandview;
    }
}
