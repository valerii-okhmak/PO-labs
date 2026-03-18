package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    private String email;
    private String name;
    @Column(name = "organization_id")
    private Long organizationId;
    @Column(name = "role_id")
    private Long roleId;
}