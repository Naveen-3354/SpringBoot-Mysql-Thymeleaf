package com.example.SpringThymeleaf.controller;

import com.example.SpringThymeleaf.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

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
        return "redirect:/";
    }
}
