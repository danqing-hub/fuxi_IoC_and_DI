package com.danqing.fuxi.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author 丹青
 * @date 2019/9/21 - 20:47
 **/
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("userdao很帅!");
    }
}
