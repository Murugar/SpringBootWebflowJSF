package com.iqmsoft.boot.webflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @RequestMapping(path = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(path = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/")
    public String root() {
        return "index";
    }

}
