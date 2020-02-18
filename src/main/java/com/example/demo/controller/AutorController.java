package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController("/autor")
public class AutorController {

    private final AutorRepository repository;

    @Autowired
    public AutorController(final AutorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{cpf}")
    public Autor escritores(@PathParam(value = "cpf") Integer cpf) {
        return repository.findById(cpf).orElse(null);
    }
    @GetMapping
    public List<Autor> escritores() {
        return repository.findAll();
    }

    @PostMapping
    public Autor criarEscritor(@RequestBody Autor autor) {
        return repository.save(autor);
    }

    @DeleteMapping("{cpf}")
    public void deletarEscritor(@PathVariable("cpf") Integer cpf) {
        Autor autor = repository.findById(cpf).orElse(null);
        repository.delete(autor);
    }

    @PutMapping(value = "/{cpf}")
    public Autor atualizarAutor(@PathVariable Integer cpf, @RequestBody Autor autor) {
        Autor autorSalvo = repository.findById(cpf).orElse(null);
        autorSalvo.setNome(autor.getNome());
        autorSalvo.setCpf(autor.getCpf());
        autorSalvo.setLivros(autor.getLivros());
        return repository.save(autorSalvo);
    }

}
