package com.dreaminglri.myfirstspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreaminglri.myfirstspringboot.entity.Order;
import com.dreaminglri.myfirstspringboot.entity.User;
import com.dreaminglri.myfirstspringboot.entity.t_User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from t_order where uid = #{uid}")
    public List<Order> selectByUid(int uid);

    @Select("select * from t_order")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "order_time", property = "order_time"),
            @Result(column = "total", property = "total"),
            @Result(column = "uid", property = "user", javaType = t_User.class,
                one = @One(select = "com.dreaminglri.myfirstspringboot.mapper.t_UserMapper.selectById")
            ),
    })
    public List<Order> selectAllOrdersAndUser();

}
