package org.example.app01.controller;

import org.apache.catalina.User;
import org.example.DTO.UserForm;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class RestUserController {

    @PostMapping("/user1")
    public String register(@RequestParam Map<String , Objects> map) {
        System.out.println(map);
        return "success";
    }
    @PostMapping("/user2")
    public String register2(@RequestBody Map<String, Objects> map) {
        System.out.println(map);
        return "success";
    }
}
