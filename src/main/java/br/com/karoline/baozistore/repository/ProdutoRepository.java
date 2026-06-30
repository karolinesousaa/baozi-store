package br.com.karoline.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.karoline.baozistore.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}