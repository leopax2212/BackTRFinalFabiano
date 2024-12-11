package org.senac.aula01.repository;

import java.util.List;

import org.senac.aula01.model.Produto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio 
        extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContains(String filter, Sort s);
    
}
