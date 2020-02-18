package com.example.demo.repository;

import com.example.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
    List <Livro> findByTitulo(String titulo);
}
