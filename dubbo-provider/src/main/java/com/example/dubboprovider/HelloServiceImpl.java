package com.example.dubboprovider;

import com.example.dubboprovider.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@Slf4j
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        log.info("說Hello");
        return "Hello Dubbo";
    }
}
