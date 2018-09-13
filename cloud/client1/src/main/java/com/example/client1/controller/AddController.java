package com.example.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 1400469
 * @desc
 * @time 2018/9/10 14:04
 */

@RestController
@RequestMapping("/add")
public class AddController {

    @Value("${client.wayen}")
    String type;

    @RequestMapping("/calc")
    public int calc(int a, int b){
        return a + b;
    }

    @RequestMapping("/type")
    public String type(){
        return type;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
