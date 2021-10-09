package com.atguigu.spring5;

import com.atguigu.spring5.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author shkstart
 * @create 2021-10-09 14:27
 */

@Repository(value = "userDaoImpl123")
public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
