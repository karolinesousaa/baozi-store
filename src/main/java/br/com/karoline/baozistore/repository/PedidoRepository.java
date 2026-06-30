package br.com.karoline.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.karoline.baozistore.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}