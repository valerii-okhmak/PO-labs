package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "resource_limits")
@Data
@EqualsAndHashCode(callSuper = true)
public class ResourceLimit extends BaseEntity {
    @Column(name = "max_users")
    private Integer maxUsers;
    @Column(name = "storage_mb")
    private Integer storageMb;
}

