package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2021-10-11 9:08
 */
@Component
public class User {

    public void add() {
        System.out.println("add...");
    }
}
