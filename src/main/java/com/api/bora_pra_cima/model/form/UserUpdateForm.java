package com.api.bora_pra_cima.model.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserUpdateForm {

    @NotBlank(message = "Nome nao pode estar em branco")
    private String name;

    @Email(message = "Email invalido")
    private String email;
}
