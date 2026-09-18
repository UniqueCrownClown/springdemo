package com.graphql.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.graphql.mapper")
public class MybatisPlusConfig {
}

