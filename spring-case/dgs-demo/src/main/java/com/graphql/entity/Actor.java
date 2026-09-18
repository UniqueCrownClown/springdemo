package com.graphql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
public class Actor implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 联系人ID
     */
    @TableId(type = IdType.AUTO)
    private Integer actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;

}
