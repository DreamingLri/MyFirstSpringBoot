package com.dreaminglri.myfirstspringboot.mapper;

import com.dreaminglri.myfirstspringboot.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> find();

    @Insert("insert into user values (#{id},#{username},#{password},#{birthday})")
    public int insert(User user);

    @Delete("delete from user where id = #{id}")
    public int delete(int id);

    @Select("select * from user where id = #{id}")
    public User findbyId(int id);

    @Select("select * from user")
    public List<User> getAll();
}
