package br.com.avaliacao.Produto.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "Produtos")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long id;

    @Column (name = "Descricao")
    String descricao;

    @Column
    Date dataValidade;

    public Produto() {
    }

    public Produto(String descricao, Date dataValidade) {
        this.descricao = descricao;
        this.dataValidade = dataValidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
