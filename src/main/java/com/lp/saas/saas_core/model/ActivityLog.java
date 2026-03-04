package com.lp.saas.saas_core.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = true)
public class ActivityLog extends BaseEntity {
    private String action;
    private Long userId;
    private LocalDateTime timestamp;
}