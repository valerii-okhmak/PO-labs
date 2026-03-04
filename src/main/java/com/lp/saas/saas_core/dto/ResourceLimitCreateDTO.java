package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ResourceLimitCreateDTO {
    @NotNull(message = "Максимальна кількість користувачів є обов'язковою")
    @Min(value = 1, message = "Має бути мінімум 1 користувач")
    private Integer maxUsers;

    @NotNull(message = "Ліміт пам'яті є обов'язковим")
    @Min(value = 0, message = "Ліміт пам'яті не може бути від'ємним")
    private Integer storageMb;
}
