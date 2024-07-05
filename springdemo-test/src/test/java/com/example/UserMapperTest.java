package com.example;

import com.example.domain.po.User;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setId(5L);
        user.setName("Lucy");
        user.setPhone("18688990011");

        user.setSex("0");
        user.setIdNumber("123456789012345678");
        user.setCreateTime(LocalDateTime.now());
        userMapper.insert(user);
    }

    @Test
    public void testSelectById() {
        User user = userMapper.selectById(5L);
        System.out.println("user = " + user);
    }

    @Test
    public void testSelectByIds() {
        List<User> users = userMapper.selectBatchIds(List.of(1L, 2L, 3L, 4L, 5L));
        users.forEach(System.out::println);
    }

    @Test
    public void testUpdateById() {
        User user = new User();
        user.setId(5L);
        user.setName("jack");
        userMapper.updateById(user);
    }

    @Test
    public void testDelete() {
        userMapper.deleteById(5L);
    }
}
