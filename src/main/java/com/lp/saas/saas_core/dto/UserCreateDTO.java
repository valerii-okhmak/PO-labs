package com.lp.saas.saas_core.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserCreateDTO {
    @NotBlank(message = "Email не може бути порожнім")
    @Email(message = "Некоректний формат email")
    private String email;

    @NotBlank(message = "Ім'я не може бути порожнім")
    private String name;

    @NotNull(message = "ID організації є обов'язковим")
    private Long organizationId;

    @NotNull(message = "ID ролі є обов'язковим")
    private Long roleId;
}
