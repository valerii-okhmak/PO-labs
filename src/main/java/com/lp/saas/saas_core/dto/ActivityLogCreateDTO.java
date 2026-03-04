package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ActivityLogCreateDTO {
    @NotBlank(message = "Опис дії не може бути порожнім")
    private String action;

    @NotNull(message = "ID користувача є обов'язковим")
    private Long userId;
}