package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PaymentCreateDTO {
    @NotNull(message = "Сума платежу є обов'язковою")
    @Positive(message = "Сума платежу має бути більшою за нуль")
    private Double amount;

    @NotBlank(message = "Статус платежу не може бути порожнім (напр. SUCCESS)")
    private String status;

    @NotNull(message = "ID організації є обов'язковим")
    private Long organizationId;
}