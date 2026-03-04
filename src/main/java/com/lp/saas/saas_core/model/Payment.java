package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper = true)
public class Payment extends BaseEntity {
    private Double amount;
    private String status; 
    private Long organizationId;
}
