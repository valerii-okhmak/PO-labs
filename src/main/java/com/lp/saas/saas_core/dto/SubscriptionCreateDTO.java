package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class SubscriptionCreateDTO {
    @NotBlank(message = "Назва плану не може бути порожньою")
    private String planName;

    @NotNull(message = "Ціна є обов'язковою")
    @PositiveOrZero(message = "Ціна не може бути від'ємною")
    private Double price;

    @NotNull(message = "ID ліміту ресурсів є обов'язковим")
    private Long resourceLimitId;
}