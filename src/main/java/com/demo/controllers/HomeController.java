package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deepak singh on 06-Sep-15.
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "logout";
    }
}
