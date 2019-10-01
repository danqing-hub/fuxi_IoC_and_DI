package com.danqing.fuxi.ioc_and_di;

/**
 * @author 丹青
 * @date 2019/9/21 - 18:48
 **/
public class UserServiceImpl implements UserService {
    //1.声明需要注入类的属性
    private UserDao userDao;
    //2.添加注入类的setter方法，用于实现注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //3.实现接口中的方法
    @Override
    public void say() {
        //4.调用注入类中的方法
        this.userDao.say();
        System.out.println("UserService say HelloWord!");
    }
}
