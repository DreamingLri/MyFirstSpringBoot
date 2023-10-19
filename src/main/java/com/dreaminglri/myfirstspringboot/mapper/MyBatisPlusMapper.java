package com.dreaminglri.myfirstspringboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dreaminglri.myfirstspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyBatisPlusMapper extends BaseMapper<User>{

}
