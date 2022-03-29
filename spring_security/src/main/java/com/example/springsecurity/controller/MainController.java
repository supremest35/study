package com.example.springsecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {

    @RequestMapping("/")
    public String index() {
        log.info("### index page");
        return "index";
    }


    @RequestMapping("/login")
    public String login() {
        log.info("### login page");
        return "login";
    }
}
