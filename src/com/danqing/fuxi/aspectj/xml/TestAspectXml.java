package com.danqing.fuxi.aspectj.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 丹青
 * @date 2019/9/22 - 15:27
 **/
public class TestAspectXml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext03.xml");
        User userDao = (User) applicationContext.getBean("userDao");
        userDao.addUser();
        userDao.deleteUser();
    }
}
