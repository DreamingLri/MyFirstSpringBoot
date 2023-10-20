package com.dreaminglri.myfirstspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreaminglri.myfirstspringboot.entity.t_User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface t_UserMapper extends BaseMapper<List> {
    @Select("select * from t_user where id = #{id}")
    public t_User selectById(int id);


    @Select("select * from t_user")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "username", property = "username"),
                    @Result(column = "password", property = "password"),
                    @Result(column = "birthday", property = "birthday"),
                    @Result(column = "id", property = "orders", javaType = List.class,
                    many = @Many(select = "com.dreaminglri.myfirstspringboot.mapper.OrderMapper.selectByUid"))
            }
    )
    List<t_User> selectAllUsersAndOrders();
}
