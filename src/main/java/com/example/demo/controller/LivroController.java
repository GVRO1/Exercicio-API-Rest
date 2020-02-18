package com.example.demo.controller;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/{isbn}")
    public Livro resultadoId(@PathVariable(value = "isbn") Integer isbn) {
        return livroRepository.findById(isbn).orElse(null);
    }

    @GetMapping
    public List<Livro> biblioteca(@RequestParam (value = "titulo",required = false) String titulo) {
        if (titulo != null){
            return livroRepository.findByTitulo(titulo);

        } else {
            return livroRepository.findAll();
        }
    }

    @PostMapping
    public Livro criarLivro(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{isbn}")
    public Livro deletarLivro(@PathVariable Integer isbn) {
        livroRepository.deleteById(isbn);
        return null;
    }

    @PutMapping("/{isbn}")
    public Livro atualizarLivro(@PathVariable Integer isbn, @RequestBody Livro livro) {
        Livro livroSalvo = livroRepository.findById(isbn).orElse(null);
        livroSalvo.setTitulo(livro.getTitulo());
        livroSalvo.setAutor(livro.getAutor());
        livroSalvo.setIsbn(livro.getIsbn());
        livroRepository.save(livroSalvo);
        return null;
    }

}
