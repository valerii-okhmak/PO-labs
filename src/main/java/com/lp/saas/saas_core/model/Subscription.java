package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "subscriptions")
@Data
@EqualsAndHashCode(callSuper = true)
public class Subscription extends BaseEntity {
    @Column(name = "plan_name")
    private String planName;
    private Double price;
    @Column(name = "resource_limit_id")
    private Long resourceLimitId;
}

