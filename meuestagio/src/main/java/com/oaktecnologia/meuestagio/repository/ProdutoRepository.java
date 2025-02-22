package com.oaktecnologia.meuestagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oaktecnologia.meuestagio.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
   
}