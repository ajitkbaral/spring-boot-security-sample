package com.ajitkbaral.springboot.securitysample.controller;

import com.ajitkbaral.springboot.securitysample.model.User;
import com.ajitkbaral.springboot.securitysample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired private UserService userService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login()  {
        return "login";
    }

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public @ResponseBody List<User> getEmployees()  {
        return userService.getAll();
    }
    @RequestMapping(value = "user", method = RequestMethod.GET)
    public @ResponseBody String getUser()  {
        return "This is the user access";
    }
    @RequestMapping(value = "dba", method = RequestMethod.GET)
    public @ResponseBody String getDBA()  {
        return "This is the DBA access";
    }


}
