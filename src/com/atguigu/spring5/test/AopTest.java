package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
import com.atguigu.spring5.config.Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shkstart
 * @create 2021-10-11 9:29
 */
public class AopTest {
    @Test
    public void AopAnnoTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void AopXmlTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book user = context.getBean("book", Book.class);
        user.buy();
    }

    @Test
    public void AopAnnoTest2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
