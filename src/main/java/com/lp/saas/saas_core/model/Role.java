package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "roles")
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {
    private String name;
    private String permissions;
}

