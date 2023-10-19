package com.dreaminglri.myfirstspringboot.contorller;

import com.dreaminglri.myfirstspringboot.entity.User;
import com.dreaminglri.myfirstspringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User2MySQLController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/user2")
    public List query(){
        List<User> list = userMapper.find();
        System.out.println(list);
        return list;
    }

    @PostMapping("/user2")
    public String save(User user){
        int i = userMapper.insert(user);
        if(i > 0){
            return "插入成功";
        } else {
            return "插入失败";
        }
    }

    @GetMapping("/user2/delete/{id}")
    public String delete(@PathVariable int id){
        userMapper.delete(id);
        return "删除成功";
    }

    @GetMapping("/user2/find/{id}")
    public User findbyId(@PathVariable int id){
        User user = userMapper.findbyId(id);
        return user;
    }

    @GetMapping("/user2/all")
    public List findAll(){
        List<User> users = userMapper.getAll();
        return users;
    }
}
