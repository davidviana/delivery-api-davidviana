package com.deliverytech.delivery_api.repository;

import org.springframework.stereotype.Repository;
import com.deliverytech.delivery_api.entity.Cliente;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {

    Optional<Cliente> findByEmail(String email);

    boolean existsByEmail(String email);

    List<Cliente> findByAtivoTrue();

    List<Cliente> findByNomeContainingIgnoreCase(String nome);
    
}