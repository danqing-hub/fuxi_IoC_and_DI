package com.danqing.fuxi.ioc_and_di;

/**
 * @author 丹青
 * @date 2019/9/21 - 18:36
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("UserDao say HelloWord!");
    }
}
