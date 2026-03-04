package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Subscription extends BaseEntity {
    private String planName;
    private Double price;
    private Long resourceLimitId;
}

