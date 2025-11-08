package com.deliverytech.delivery_api.repository;

import java.util.List;
import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Pedido;
import com.deliverytech.delivery_api.enums.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {
    List<Pedido> findByClienteId(Long clienteId);
    List<Pedido> findByStatus(StatusPedido status);
    List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);
    Pedido findByNumeroPedido(String numeroPedido);
    List<Pedido> findByRestauranteIdOrderByDataPedidoDesc(Long restauranteId);
    List<Pedido> findTop10ByOrderByDataPedidoDesc();
    List<Pedido> findByDataPedidoBetween(LocalDateTime inicio, LocalDateTime fim);
}