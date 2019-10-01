package com.danqing.fuxi.ioc_and_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 丹青
 * @date 2019/9/21 - 18:54
 **/
public class TestDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService = (UserService) applicationContext.getBean("userService");
       userService.say();
    }
}
