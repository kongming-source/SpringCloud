package com.etc.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String sayHi(){
        return "Hi springboot";
    }

    @RequestMapping("/hi2")
    public String sayHi2(String name){
        return "Hi springboot2" + name;
    }
}
