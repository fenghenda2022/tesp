package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("hello2")
public class HelloController {
    @RequestMapping("")
    public String hello() {
        return "testc123";
    }
    @RequestMapping("/index1")
    String index() {
        return "Hello from index";
    }}

