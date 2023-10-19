package com.dreaminglri.myfirstspringboot.contorller;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreaminglri.myfirstspringboot.entity.User;
import com.dreaminglri.myfirstspringboot.mapper.MyBatisPlusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class User2MyBatisPlusController{
    @Autowired
    private MyBatisPlusMapper plusMapper;

    @GetMapping("/user3")
    public List query(){
        List<User> list = plusMapper.selectList(null);
        return list;
    }
}
