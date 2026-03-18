package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "organizations")
@Data
@EqualsAndHashCode(callSuper = true)
public class Organization extends BaseEntity {
    private String name;
    @Column(name = "subscription_id")
    private Long subscriptionId;
}
