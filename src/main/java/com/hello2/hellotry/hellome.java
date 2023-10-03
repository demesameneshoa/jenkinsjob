package com.hello2.hellotry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellome {
    @RequestMapping("/")
    public String hello(){
        return "hello world!";
    }
}
