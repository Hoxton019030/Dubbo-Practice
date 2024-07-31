package com.example.dubboconsumer.controller;

import com.example.dubboprovider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello(){
        return helloService.sayHello();
    }
}
