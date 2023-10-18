package com.dreaminglri.myfirstspringboot.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    @GetMapping("/hello")

    //http://localhost/hello?nickname=zhangsan&phone=123
    public String hello(String nickname, String phone){
        System.out.println(phone);
        return "Hello" + nickname;
    }
}
