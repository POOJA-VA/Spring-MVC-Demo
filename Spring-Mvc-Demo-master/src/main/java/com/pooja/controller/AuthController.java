package com.pooja.controller;

import com.pooja.dao.UserDao;
import com.pooja.model.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.pooja.dao.UserDao.login;
import static com.pooja.dao.UserDao.register;

public class AuthController {
    private static UserDao userDao;

    public AuthController() {

        userDao = new UserDao();
    }
    @RequestMapping("/login")
    public String processLogin(@ModelAttribute("user") User user) {
        if (login(user)) {
            return "index";
        }
        return "login";
    }

    @RequestMapping("/register")
    public String processRegistration(@ModelAttribute("user") User user) {
        if (register(user)) {
            return "index";
        }
        return "processRegister";
    }
}