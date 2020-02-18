package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column(name = "cpf")
    private Integer cpf;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.REMOVE)
    @JsonBackReference
    private Set<Livro> livros;

    public Set<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Set<Livro> livros) {
        this.livros = livros;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                '}';
    }
}
