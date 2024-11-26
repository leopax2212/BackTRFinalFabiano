package org.senac.aula01.controller;

import java.util.List;

import org.senac.aula01.model.Produto;
import org.senac.aula01.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepositorio repository;

    @GetMapping
    public List<Produto> get() {

        return repository.findAll();
    }
    
    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return repository.save(produto);
    }
}
