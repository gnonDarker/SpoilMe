package com.example.spoilme;

import com.alibaba.fastjson2.JSON;
import com.example.spoilme.controller.UserController;
import com.example.spoilme.pojo.Adoption;
import com.example.spoilme.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest

public class UserTest {
    @Autowired
    UserController loginController;
    @Test
    void register() {
        User user = new User();
        loginController.register(user);
    }

    @Test
    void te(){

    }
}
