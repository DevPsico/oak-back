package com.oaktecnologia.meuestagio.models;

import com.oaktecnologia.meuestagio.dtos.ProdutoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeProduto;
	private String descricaoProduto;
	private double valorProduto;
	private Boolean disponivelParaVenda;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO produtoDTO) {
		
		this.id = produtoDTO.getId();
		this.nomeProduto = produtoDTO.getNomeProduto();
		this.descricaoProduto = produtoDTO.getDescricaoProduto();
		this.valorProduto = produtoDTO.getValorProduto();
		this.disponivelParaVenda = produtoDTO.getDisponivelParaVenda();
	}

	public Produto(Integer id, String nomeProduto, String descricaoProduto, double valorProduto,
			Boolean disponivelParaVenda) {
		super();
		this.id = id;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
		this.disponivelParaVenda = disponivelParaVenda;
	}
}