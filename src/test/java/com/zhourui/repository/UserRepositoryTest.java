package com.zhourui.repository;

import com.zhourui.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        System.out.println("test");
        System.out.println(dataSource);
    }


    @Test
    public  void save(){
        UserEntity user = new UserEntity();
        user.setAge(18);
        user.setGender(1);
        user.setName("foo");
        userRepository.save(user);
    }


}