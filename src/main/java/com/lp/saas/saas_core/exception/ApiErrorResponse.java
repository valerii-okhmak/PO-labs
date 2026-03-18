package com.lp.saas.saas_core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ApiErrorResponse {
    private LocalDateTime timestamp;
    private int status;
    private String message;
    private String path;
}
