package com.deliverytech.delivery_api.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
     List<Produto> findByRestauranteId(Long restauranteId);
     List<Produto> findByCategoria(String categoria);
     List<Produto> findByDisponivelTrue(); // volta apenas o disponiveis
     List<Produto> findByPrecoLessThanEqual(BigDecimal  preco);
}