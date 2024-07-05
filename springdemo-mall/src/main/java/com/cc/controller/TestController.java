package com.cc.controller;

import com.cc.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping
    public Result<String> testCommon() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.append("hello", "world");
        return Result.success("helloworld");
    }
}
