package com.dreaminglri.myfirstspringboot.contorller;

import com.dreaminglri.myfirstspringboot.entity.Order;
import com.dreaminglri.myfirstspringboot.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/findall")
    public List findAll(){
        List orders = orderMapper.selectAllOrdersAndUser();
        return orders;
    }

    @GetMapping("/order/{id}")
    public List findById(@PathVariable int id){
        List order = orderMapper.selectByUid(id);
        return order;
    }
}
