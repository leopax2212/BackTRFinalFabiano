package org.senac.aula01.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "description", length = 255)
    private String descricao;

    private Double preco;

    @Column(name = "url_imagem", length = 255) // Nova coluna para armazenar a URL da imagem
    private String url_imagem;

    // No-argument constructor required by Hibernate
    public Produto() {
    }

    // Constructor with parameters
    public Produto(Integer id, String nome, String descricao, Double preco, String url_imagem) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.url_imagem = url_imagem;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public String getUrlImagem() {
        return url_imagem;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setUrlImagem(String url_imagem) {
        this.url_imagem = url_imagem;
    }
}
