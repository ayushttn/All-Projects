package com.springmvc.controller;

import com.springmvc.service.UserService;
import com.springmvc.dto.UserDto;
import com.springmvc.model.User;
import com.springmvc.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User createUser(UserDto userDto, @RequestParam(value = "addresses[]")List<String> address, @RequestParam(value = "contacts[]") List<Long> contacts) throws Exception {
        User user = userService.createUser(userDto, address, contacts);
        return user;
    }

    @GetMapping("/showAll")
    public List<UserDto> getAllUsers(){
        List<UserDto> list = userService.getAll();
        return list;
    }

}
