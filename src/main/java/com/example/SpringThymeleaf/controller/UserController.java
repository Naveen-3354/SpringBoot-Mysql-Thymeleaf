package com.example.SpringThymeleaf.controller;

import com.example.SpringThymeleaf.model.UserDetails;
import com.example.SpringThymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String Login(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("UserDetails",userDetails);
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        UserDetails userDetails = new UserDetails();
        model.addAttribute("UserDetails",userDetails);
        return "register";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("UserDetails") UserDetails userDetails,Model model){
        userService.save(userDetails);
        return "redirect:/";
    }
}
