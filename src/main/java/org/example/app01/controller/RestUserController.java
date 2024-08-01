package org.example.app01.controller;

import org.apache.catalina.User;
import org.example.DTO.UserForm;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestUserController {

    @PostMapping("/user1")
    public String register(UserForm userForm) {
        System.out.println(userForm);
        return "success";
    }
    @PostMapping("/user2")
    public String register2(@RequestBody UserForm userForm) {
        System.out.println(userForm);
        return "success";
    }
}
