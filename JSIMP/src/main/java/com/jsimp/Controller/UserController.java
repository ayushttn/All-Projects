package com.jsimp.Controller;

import com.jsimp.DTO.UserDto;
import com.jsimp.Entity.User;
import com.jsimp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/registerUser")
    public void addUser(UserDto userDto){
        userService.createUser(userDto);
    }
}
