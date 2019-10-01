package com.danqing.fuxi.aspectj.xml;
import org.aspectj.lang.ProceedingJoinPoint;
/**
 * @author 丹青
 * @date 2019/9/22 - 14:06
 **/
public class MyAspect {
    /**
     *
     * @param proceedingJoinPint
     * @return
     * @throws Throwable
     *
     * 环绕通知
     * proceedingjoinpoint是jionpoint子接口，表示可以执行目标方法
     * 1.必须是object类型的返回值
     * 2.必须接收一个参数，类型为proceedingjoinpoint
     * 3.必须throws Throwable
     */
    public Object myAround(ProceedingJoinPoint proceedingJoinPint)throws Throwable{
        //1.执行前
        System.out.println("执行前的方法：模拟开启事务……");
        //2.方法执行（手推动执行）
        Object obj = proceedingJoinPint.proceed();
        //3.执行后
        System.out.println("方法执行后：模拟关闭事务");
        return obj;
    }
}
