package com.thymeleaf.demo.controller;

import com.thymeleaf.demo.bean.User;
import com.thymeleaf.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/showStudent")
    public String showStudent() {
        return "showStudent";
    }

    @RequestMapping("/showOneUser")
    public User showOneUser() {
        User user = userService.findOneUser();
        return user;
    }

}
