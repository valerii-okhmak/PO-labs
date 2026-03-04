package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class ResourceLimit extends BaseEntity {
    private Integer maxUsers;
    private Integer storageMb;
}

