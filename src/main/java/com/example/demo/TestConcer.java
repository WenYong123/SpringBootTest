package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testin")
public class TestConcer {
    @GetMapping("/index")
    public String index(){
        return "hello springboot！hello docker ，终于成功了";
    }
}
