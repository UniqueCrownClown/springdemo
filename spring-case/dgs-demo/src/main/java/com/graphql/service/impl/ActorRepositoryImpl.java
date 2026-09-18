package com.graphql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.graphql.entity.Actor;
import com.graphql.mapper.ActorMapper;
import com.graphql.service.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

@Validated
@Repository
@RequiredArgsConstructor
public class ActorRepositoryImpl extends ServiceImpl<ActorMapper, Actor> implements ActorRepository {
}
