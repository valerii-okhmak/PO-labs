package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class OrganizationCreateDTO {
    @NotBlank(message = "Назва організації не може бути порожньою")
    private String name;

    @NotNull(message = "ID підписки є обов'язковим")
    private Long subscriptionId;
}