package top.fjy8018.graphsqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fjy8018.graphsqldemo.entity.ActorEntity;

/**
 * 演员表DAO
 *
 * @author F嘉阳
 * @date 2021/11/5 10:35
 */
public interface ActorEntityRepository extends JpaRepository<ActorEntity, Integer> {
}
