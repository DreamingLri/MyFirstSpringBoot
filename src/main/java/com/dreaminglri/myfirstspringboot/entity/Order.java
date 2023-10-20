package com.dreaminglri.myfirstspringboot.entity;


import com.baomidou.mybatisplus.annotation.TableField;

public class Order {
    private int id;
    private String order_time;
    private String total;
    private int uid;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", order_time='" + order_time + '\'' +
                ", total='" + total + '\'' +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }

    public t_User getUser() {
        return user;
    }

    public void setUser(t_User user) {
        this.user = user;
    }

    @TableField(javaType = false)
    private t_User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderTime() {
        return order_time;
    }

    public void setOrderTime(String order_time) {
        this.order_time = order_time;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
