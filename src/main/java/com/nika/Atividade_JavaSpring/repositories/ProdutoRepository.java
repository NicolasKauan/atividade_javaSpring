package com.nika.Atividade_JavaSpring.repositories;

import com.nika.Atividade_JavaSpring.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
