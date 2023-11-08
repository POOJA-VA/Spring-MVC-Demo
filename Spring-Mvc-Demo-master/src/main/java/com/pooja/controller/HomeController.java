package com.pooja.controller;

import com.pooja.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        return "index";
    }

    @RequestMapping("/login")
    public String showForm() {
        return "login";
    }

    @RequestMapping("/register")
    public String processForm() {
        return "register";
    }

    @RequestMapping("/processRegister")
    public String processForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("bloodGroup") String bloodGroup,
            Model model
    )
    {
        name = "Name: " + name;
        email = "Email: " + email;
        password = "Password: " + password;
        bloodGroup = "Blood Group: " + bloodGroup;

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setBloodGroup(bloodGroup);
        model.addAttribute("user", user);

        return "login";
    }
}