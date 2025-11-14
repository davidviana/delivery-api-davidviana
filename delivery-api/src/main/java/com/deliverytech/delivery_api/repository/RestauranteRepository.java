package com.deliverytech.delivery_api.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository <Restaurante, Long>{
    Optional<Restaurante> findByNome(String nome);
    List<Restaurante> findByAtivoTrue();
    List<Restaurante> findByCategoria(String categoria);
    List<Restaurante> findByTaxaEntregaLessThanEqual(BigDecimal taxa);
    List<Restaurante> findTop5ByOrderByNomeAsc();
}