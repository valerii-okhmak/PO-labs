package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RoleCreateDTO {
    @NotBlank(message = "Назва ролі не може бути порожньою (напр. ADMIN)")
    private String name;

    @NotBlank(message = "Права доступу не можуть бути порожніми")
    private String permissions;
}