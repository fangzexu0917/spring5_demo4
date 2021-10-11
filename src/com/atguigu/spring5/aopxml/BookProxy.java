package com.atguigu.spring5.aopxml;

import org.aspectj.lang.annotation.Before;

/**
 * @author shkstart
 * @create 2021-10-11 10:03
 */
public class BookProxy {
    public void before() {
        System.out.println("before.........");
    }

    public void after() {
        System.out.println("after.........");
    }
}
