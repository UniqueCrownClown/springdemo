package top.fjy8018.graphsqldemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 演员表实体映射
 *
 * @author F嘉阳
 * @date 2021/11/5 10:34
 */
@Data
@Entity
@Table(name = "actor", schema = "sakila")
public class ActorEntity {
    @Id
    @Column(name = "actor_id", nullable = false)
    private Integer actorId;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;

}
