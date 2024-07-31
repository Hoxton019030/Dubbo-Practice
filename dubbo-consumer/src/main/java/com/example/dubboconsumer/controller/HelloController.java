package com.example.dubboconsumer.controller;

import com.example.dubboprovider.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello(){
        log.info("呼叫控制器");
        return helloService.sayHello();
    }
}
