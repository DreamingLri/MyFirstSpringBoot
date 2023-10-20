package com.dreaminglri.myfirstspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.List;

@TableName("t_user")
public class t_User {
    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String birthday;
    private String password;

    //描述用户所用的订单
    //TableField 告诉mybatis不要查询Order对象，order对象不存在，需要自己去做映射
//    @TableField(exist = false)
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "t_User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday='" + birthday + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
