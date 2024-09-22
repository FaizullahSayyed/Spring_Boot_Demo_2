package com.example.demo2.contollers;

import com.example.demo2.entities.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegController {

    @PostMapping("/reg")
    public UserInfo hello(@RequestBody UserInfo userinfo){
        return userinfo;
    }
}
