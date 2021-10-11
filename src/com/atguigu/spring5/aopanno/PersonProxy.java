package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-10-11 9:50
 */
@Component
@Aspect
@Order(2)
public class PersonProxy {
    //前置通知
    // @Before注解表示作为前置通知
    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("person before.........");
    }
}
