package com.oaktecnologia.meuestagio.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaktecnologia.meuestagio.models.Produto;
import com.oaktecnologia.meuestagio.repository.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private ProdutoRepository produtoRepository;

	
	public void instanciaDB() {

		Produto pro1 = new Produto(null, "Nome produto 1", "Descrição produto 1", 55.00, true);
		Produto pro2 = new Produto(null, "Nome produto 2", "Descrição produto 2", 50.00, true);
		Produto pro3 = new Produto(null, "Nome produto 3", "Descrição produto 3", 45.00, true);
		Produto pro4 = new Produto(null, "Nome produto 4", "Descrição produto 4", 40.00, true);
		Produto pro5 = new Produto(null, "Nome produto 5", "Descrição produto 5", 35.00, true);

		this.produtoRepository.saveAll(Arrays.asList(pro1, pro2, pro3, pro4, pro5));

	}
}