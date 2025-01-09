package com.oaktecnologia.meuestagio.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oaktecnologia.meuestagio.dtos.ProdutoDTO;
import com.oaktecnologia.meuestagio.models.Produto;
import com.oaktecnologia.meuestagio.services.ProdutoService;

@RestController
@RequestMapping("produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> findById(@PathVariable Integer id) {

		Produto produto = produtoService.findById(id);

		return ResponseEntity.ok().body(new ProdutoDTO(produto));
	}

	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> findAll() {

		List<Produto> listaProdutos = produtoService.findAll();

		List<ProdutoDTO> listProdutoDTOs = listaProdutos.stream().map(ProdutoDTO::new).collect(Collectors.toList());

		return ResponseEntity.ok().body(listProdutoDTOs);

	}
	
	@PostMapping
	public ResponseEntity<ProdutoDTO> save (@jakarta.validation.Valid @RequestBody ProdutoDTO produtoDTO){
		
		Produto produto = produtoService.save(produtoDTO);
		
		return ResponseEntity.ok().body(new ProdutoDTO(produto));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProdutoDTO> update (@jakarta.validation.Valid @PathVariable Integer id, @RequestBody ProdutoDTO produtoDTO){
		
		Produto produto = produtoService.update(id, produtoDTO);
		
		return ResponseEntity.ok().body(new ProdutoDTO(produto));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete (@PathVariable Integer id){
		produtoService.delete(id);
		
		return ResponseEntity.noContent().build();
	}

}