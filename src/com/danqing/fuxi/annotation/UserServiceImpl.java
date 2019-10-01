package com.danqing.fuxi.annotation;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 丹青
 * @date 2019/9/21 - 20:48
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;
    @Override
    public void say() {
        userDao.say();
        System.out.println("userservice我很帅");
    }
}
