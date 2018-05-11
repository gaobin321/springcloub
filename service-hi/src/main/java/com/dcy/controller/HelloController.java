package com.dcy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/11.
 */
@RestController
public class HelloController {


    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name") String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
