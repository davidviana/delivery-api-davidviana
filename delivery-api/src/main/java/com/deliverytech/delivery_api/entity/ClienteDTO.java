package com.deliverytech.delivery_api.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;
    private Boolean ativo;

}