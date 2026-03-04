package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {
    private String name; 
    private String permissions;
}

