package com.dreaminglri.myfirstspringboot.contorller;

import com.dreaminglri.myfirstspringboot.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String getUserId(@PathVariable int id){
        System.out.println(id);
        return "get ID";
    }

    @PostMapping("/user/")
    public String save(User user){
        return "save";
    }

    @PutMapping("/user/")
    public String update(User user){
        return "update";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id){
        System.out.println(id);
        return "delete";
    }
}
