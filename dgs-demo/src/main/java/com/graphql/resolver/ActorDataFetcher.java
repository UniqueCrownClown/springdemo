package com.graphql.resolver;

import com.graphql.entity.Actor;
import com.graphql.service.ActorRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@DgsComponent
@RequiredArgsConstructor
public class ActorDataFetcher {

    private final ActorRepository actorRepository;

    @DgsQuery
    public Collection<Actor> actorList() {
        return actorRepository.list();
    }

    @DgsQuery
    public Actor findOneActor(@InputArgument Integer id) {
        return actorRepository.getById(id);
    }
}

