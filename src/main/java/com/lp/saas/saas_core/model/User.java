package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    private String email;
    private String name;
    private Long organizationId;
    private Long roleId;
}