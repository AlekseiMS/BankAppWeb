package com.kluevja.bankappweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/client")
    public String client() {
        return "client/index";
    }
    @GetMapping("/account")
    public String account() {
        return "account/index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
//    @PostMapping("/login")
//    public String login(@RequestParam String email, @RequestParam String password) {
//        System.out.println(email + " " + password);
//        return "login";
//    }

}
