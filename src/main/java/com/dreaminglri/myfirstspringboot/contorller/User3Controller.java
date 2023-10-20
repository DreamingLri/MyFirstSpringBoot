package com.dreaminglri.myfirstspringboot.contorller;

import com.dreaminglri.myfirstspringboot.entity.t_User;
import com.dreaminglri.myfirstspringboot.mapper.t_UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User3Controller {
    @Autowired
    private t_UserMapper userMapper;

    @GetMapping("/user3/findall")
    public List<t_User> find(){
        return userMapper.selectAllUsersAndOrders();
    }

    @GetMapping("/user3/{uid}")
    public t_User selectById(@PathVariable int uid){
        return userMapper.selectById(uid);
    }

}
