package com.danqing.fuxi.aspectj.xml;

/**
 * @author 丹青
 * @date 2019/9/22 - 14:05
 **/
public class UserDaoImpl implements User {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
