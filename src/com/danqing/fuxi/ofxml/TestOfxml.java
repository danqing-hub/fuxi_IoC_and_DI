package com.danqing.fuxi.ofxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试：基于xml装配bean
 * @author 丹青
 * @date 2019/9/21 - 20:25
 **/
public class TestOfxml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
        System.out.println(applicationContext.getBean("user"));
    }
}
