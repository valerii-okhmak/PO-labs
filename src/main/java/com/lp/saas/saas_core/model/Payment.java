package com.lp.saas.saas_core.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "payments")
@Data
@EqualsAndHashCode(callSuper = true)
public class Payment extends BaseEntity {
    private Double amount;
    private String status;
    @Column(name = "organization_id")
    private Long organizationId;
}
