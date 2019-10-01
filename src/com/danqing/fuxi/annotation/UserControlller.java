package com.danqing.fuxi.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.sql.SQLOutput;

/**
 * @author 丹青
 * @date 2019/9/21 - 20:57
 **/
@Controller("userController")
public class UserControlller {
    @Resource(name="userService")
    private UserService userService;
    public void say(){
        this.userService.say();
        System.out.println("usercontroller我很帅");
    }
}
