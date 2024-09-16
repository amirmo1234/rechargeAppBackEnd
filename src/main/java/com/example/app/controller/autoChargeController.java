package com.example.app.controller;

import com.example.app.model.UserModel;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class autoChargeController {
    @Autowired
    UserService userService;


    @PostMapping("/recharge")
    public String addMoneyToUser(@RequestBody UserModel userModel) {
        return userService.addMoney(userModel);
    }


/*    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public UserModel addUser(@RequestBody UserModel userModel){
        return userService.creatUser(userModel);
    }

    @PostMapping("/addCharge")
    public UserModel addMoney(UserModel userModel){

    }*/
}
