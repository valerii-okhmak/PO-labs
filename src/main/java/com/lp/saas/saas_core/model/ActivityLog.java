package com.lp.saas.saas_core.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Entity
@Table(name = "activity_logs")
@Data
@EqualsAndHashCode(callSuper = true)
public class ActivityLog extends BaseEntity {
    private String action;
    @Column(name = "user_id")
    private Long userId;
    private LocalDateTime timestamp;
    
    @PrePersist 
    protected void onCreate() {
        this.timestamp = LocalDateTime.now();
    }
}