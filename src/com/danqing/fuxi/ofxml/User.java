package com.danqing.fuxi.ofxml;

import java.util.List;

/**
 * @author 丹青
 * @date 2019/9/21 - 20:14
 **/
public class User {
    private String username;
    private Integer password;
    private List<String> list;

    public User(String username, Integer password, List<String> list) {
        this.username = username;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", list=" + list +
                '}';
    }
}
