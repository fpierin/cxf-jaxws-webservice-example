package com.wordpress.oreboladodeturing.webservices;

import org.springframework.stereotype.Component;

import com.wordpress.oreboladodeturing.model.webservices.BibliotecaService;
import com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro;

@Component
public class BibliotecaServiceImpl implements BibliotecaService {

    @Override
    public String adicionarLivro(final Livro adicionarLivro) {
	return "666";
    }

}
