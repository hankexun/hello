package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hankexun
 * 2019/9/26
 */
@RequestMapping("/hello")
@RestController
public class Hello {

    @RequestMapping("/")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
