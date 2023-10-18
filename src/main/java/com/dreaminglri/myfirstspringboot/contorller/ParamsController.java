package com.dreaminglri.myfirstspringboot.contorller;

import com.dreaminglri.myfirstspringboot.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParamsController {

    @RequestMapping(value = "/getTest1", method = RequestMethod.GET)
    public String getTest1(){
        return "GET请求";
    }

    @RequestMapping(value = "/getTest2", method = RequestMethod.GET)
    public String getTest2(String nickname, String phone){
        System.out.println("nickname:" + nickname);
        System.out.println("phone:" + phone);
        return "GET请求";
    }

    @RequestMapping(value = "/getTest3", method = RequestMethod.GET)
    //RequestParam 参数映射，默认必须传递（不然会报400错误），如果写了required = false则都可以
    public String getTest3(@RequestParam(value = "nickname", required = false) String name){
        return name;
    }

    @RequestMapping(value = "/postTest1", method = RequestMethod.POST)
    public String postTest1(){
        return "POST请求";
    }

    @RequestMapping(value = "/postTest2", method = RequestMethod.POST)
    public String postTest2(String nickname, String phone){
        System.out.println(nickname);
        System.out.println(phone);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3", method = RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest4", method = RequestMethod.POST)
    public String postTest4(@RequestBody User user){
        //RequestBody 接收json必须
        System.out.println(user);
        return "POST请求";
    }

    @GetMapping("/test/*")
    public String test(){
        return "通配符请求";
    }
    //**无限层级
    //*仅一层
    //?完全匹配
}
