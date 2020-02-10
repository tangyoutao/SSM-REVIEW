package net.wanho.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello(Map map){
        map.put("msg","这里是HELLO页面！");
        return "hello";
    }

}
