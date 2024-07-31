package com.example.dubboprovider;

import com.example.dubboprovider.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello Dubbo";
    }
}
