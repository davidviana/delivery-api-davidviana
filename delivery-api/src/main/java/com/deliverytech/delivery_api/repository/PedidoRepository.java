package com.deliverytech.delivery_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

    List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);

    Pedido findByNumeroPedido(String numeroPedido);

    List<Pedido> findByRestauranteIdOrderByDataPedidoDesc(Long restauranteId);

}