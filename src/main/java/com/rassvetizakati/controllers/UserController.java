package com.rassvetizakati.controllers;

import com.rassvetizakati.entity.User;
import com.rassvetizakati.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;
    //Внедрение зависимостей почитать
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //принимает на вход запрос, в котором содержится json с ифнормацией о юзере.
    @PostMapping(produces = {"application/json"})
    public @ResponseBody User createUser(@RequestBody User user) {
        return userService.createUser(user);

    }
}
