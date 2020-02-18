package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @Column(name = "isbn")
    private Integer isbn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_autor", nullable = false)
    private Autor autor;

    @Column(name = "titulo")
    private String titulo;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
