package com.webapp.app.controller;

import com.webapp.app.Service.LoggedUserManagementService;
import com.webapp.app.Service.LoginProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;

    @Autowired
    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor=loginProcessor;
    }

    @GetMapping("/")
    public String loginGet(){
        return "login";
    }
    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                            @RequestParam String password,
                            Model model){
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn=loginProcessor.login();
        if(loggedIn){
            return "redirect:/main";
        }
        model.addAttribute("message", "Login failed!");
        return "login.html";
    }
}
