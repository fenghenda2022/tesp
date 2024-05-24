package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("hello4")
public class HelloController {
    @RequestMapping("")
    public String hello() {
        return "jenkens test";
    }
    @RequestMapping("/index4")
    String index() {
        return "jenken test 2";
    }}

