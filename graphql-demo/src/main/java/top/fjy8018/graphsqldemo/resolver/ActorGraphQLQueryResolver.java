package top.fjy8018.graphsqldemo.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import top.fjy8018.graphsqldemo.entity.ActorEntity;
import top.fjy8018.graphsqldemo.repository.ActorEntityRepository;

import java.util.Collection;

/**
 * 演员表GraphQL查询解析器
 *
 * @author F嘉阳
 * @date 2021/11/5 16:27
 */
@Component
@AllArgsConstructor
public class ActorGraphQLQueryResolver implements GraphQLQueryResolver {

    private final ActorEntityRepository actorRepository;

    public Collection<ActorEntity> actorList() {
        return actorRepository.findAll();
    }

    public ActorEntity findOneActor(Integer id) {
        return actorRepository.findById(id).orElse(null);
    }
}
