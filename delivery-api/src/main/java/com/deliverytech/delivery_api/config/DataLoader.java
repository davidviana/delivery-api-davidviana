package com.deliverytech.delivery_api.config;

import java.util.List;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.deliverytech.delivery_api.entity.Restaurante;
import com.deliverytech.delivery_api.entity.Produto;
import com.deliverytech.delivery_api.entity.Cliente;
import com.deliverytech.delivery_api.entity.Pedido;

import com.deliverytech.delivery_api.repository.ClienteRepository;
import com.deliverytech.delivery_api.repository.RestauranteRepository;
import com.deliverytech.delivery_api.repository.ProdutoRepository;
import com.deliverytech.delivery_api.repository.PedidoRepository;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("🔹 Carregando dados de teste...");

        // --- Clientes ---
        Cliente c1 = new Cliente("Ana", "ana@email.com", "(11) 96060-6107", "Av. Dracena 450");
        Cliente c2 = new Cliente("Bruno", "bruno@email.com", "(11) 96060-6108", "Av. Dracena 451");
        Cliente c3 = new Cliente("Carla", "carla@email.com", "(11) 96060-6109", "Av. Dracena 452");
        clienteRepository.saveAll(List.of(c1, c2, c3));

        // --- Restaurantes ---
        Restaurante r1 = new Restaurante(
            "PizzaTop", 
            "Pizzaria", 
            "Av Dracena", 
            "(11) 94489-9483", 
            new BigDecimal("0.90"),
            new BigDecimal("4.76")
            );

        Restaurante r2 = new Restaurante(
            "Suzzy", 
            "Sushi", 
            "Av Dracena", 
            "(11) 94489-9483", 
            new BigDecimal("1.90"),
            new BigDecimal("4.26")
            );
        restauranteRepository.saveAll(List.of(r1, r2));

        // // --- Produtos ---
        // Produto p1 = new Produto("Pizza Calabresa", 45.0, r1);
        // Produto p2 = new Produto("Pizza Marguerita", 42.0, r1);
        // Produto p3 = new Produto("Sushi Combo", 60.0, r2);
        // Produto p4 = new Produto("Temaki", 30.0, r2);
        // Produto p5 = new Produto("Guaraná", 7.0, r1);
        // produtoRepository.saveAll(List.of(p1, p2, p3, p4, p5));

        // --- Pedidos ---
        Pedido ped1 = new Pedido(
            "1", 
            LocalDateTime.now(),
            "Pendente",
            new BigDecimal("10.21"), 
            "Sem Cebola",
            2L,
            r1
            );
        Pedido ped2 = new Pedido();
        pedidoRepository.saveAll(List.of(ped1, ped2));

        System.out.println("✅ Dados de teste inseridos com sucesso!");
    }
}
