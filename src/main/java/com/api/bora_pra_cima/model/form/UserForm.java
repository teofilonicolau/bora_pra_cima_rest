package com.api.bora_pra_cima.model.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
public class UserForm {

    @NotBlank(message = "Nome nao pode estar em branco")
    private String name;
    @NotBlank @Email(message = "Endereço de e-mail invalido")
    private String email;
    @CPF(message = "Numero de CPF invalido")
    private String cpf;
    @NotNull(message = "Data de nascimento nao pode ser nula")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;


}