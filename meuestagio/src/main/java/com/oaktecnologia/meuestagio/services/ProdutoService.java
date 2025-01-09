package com.oaktecnologia.meuestagio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oaktecnologia.meuestagio.dtos.ProdutoDTO;
import com.oaktecnologia.meuestagio.models.Produto;
import com.oaktecnologia.meuestagio.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto findById(Integer id) {

		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isPresent()) {
			return produto.get();
		}
		throw new com.oaktecnologia.meuestagio.exceptions.ObjectNotFoundException("Produto não encontrado !!!");
	}

	public List<Produto> findAll() {

		List<Produto> listaProdutos = produtoRepository.findAll();

		if (listaProdutos.isEmpty()) {
			throw new com.oaktecnologia.meuestagio.exceptions.ObjectNotFoundException(
					"Não existe produto cadastrado !!!");

		} else {
			return listaProdutos;
		}

	}

	public Produto save(ProdutoDTO produtoDTO) {

		produtoDTO.setId(null);

		return produtoRepository.save(new Produto(produtoDTO));
	}

	public Produto update(Integer id, ProdutoDTO produtoDTO) {

		Produto produto = findById(id);

		produtoDTO.setId(produto.getId());

		return produtoRepository.save(new Produto(produtoDTO));

	}

	public void delete(Integer id) {

		findById(id);

		produtoRepository.deleteById(id);

	}
}