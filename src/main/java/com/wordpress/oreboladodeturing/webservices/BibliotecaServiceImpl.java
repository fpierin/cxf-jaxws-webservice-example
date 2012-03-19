package com.wordpress.oreboladodeturing.webservices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.wordpress.oreboladodeturing.model.webservices.BibliotecaService;
import com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro;

@Component
public class BibliotecaServiceImpl implements BibliotecaService {

    private final Map<String, Livro> biblioteca = new HashMap<String, Livro>();

    @Override
    public String adicionarLivro(final Livro livro) {
	final int hashCode = livro.hashCode();
	final String stringHashCode = String.valueOf(hashCode);
	biblioteca.put(stringHashCode, livro);
	return stringHashCode;
    }

    @Override
    public boolean removerLivroCodigo(final String codigo) {
	if (biblioteca.containsKey(codigo)) {
	    biblioteca.remove(codigo);
	    return true;
	}
	return false;
    }

}
