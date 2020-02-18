package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    //    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
//
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner(@Autowired final AutorRepository autorRepository,
//                             @Autowired final LivroRepository livroRepository) {
//        return args -> {
//            Autor autor = new Autor();
//            autor.setCpf(123);
//            autor.setNome("Joao");
//
//            log.info("Salvando autor: {}", autor);
//            Autor saved = autorRepository.save(autor);
//
//            log.info("Autor salvo: {}", saved);
//
//            Livro livro = new Livro();
//            livro.setIsbn(123);
//            livro.setTitulo("Bababa");
//            livro.setAutor(saved);
//            log.info("Livro : {}",);
//
//
//            Livro savedLivro = livroRepository.save(livro);
//            log.info("Livro salvo: {}", savedLivro);

//            Autor autorNovo = autorRepository.findById(123).get();
//            log.info("Autor depois: {}", autorNovo);


}


