package com.deliverytech.delivery_api.entity;
import com.deliverytech.delivery_api.entity.Restaurante;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produtos")

public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String categoria;
    private Boolean disponivel;
    private Long restauranteId;

    public Produto(
        String nome,
        String descricao,
        BigDecimal preco,
        String categoria,
        Boolean disponivel,
        Long restaurantId
    ) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.disponivel = disponivel;
        this.restauranteId = restauranteId;
    }

}
