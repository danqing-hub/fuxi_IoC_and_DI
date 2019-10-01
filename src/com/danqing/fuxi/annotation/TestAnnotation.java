package com.danqing.fuxi.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 丹青
 * @date 2019/9/21 - 20:52
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext02.xml");
        UserControlller userController = (UserControlller) applicationContext.getBean("userController");
        userController.say();
    }
}
