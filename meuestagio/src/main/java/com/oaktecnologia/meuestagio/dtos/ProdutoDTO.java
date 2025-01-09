package com.oaktecnologia.meuestagio.dtos;

import com.oaktecnologia.meuestagio.models.Produto;

import lombok.Data;

@Data
public class ProdutoDTO {
	
	private Integer id;
	private String nomeProduto;
	private String descricaoProduto;
	private double valorProduto;
	private Boolean disponivelParaVenda;
	
	public ProdutoDTO() {
		
	}
	
	public ProdutoDTO(Produto produto) {
		
		this.id = produto.getId();
		this.nomeProduto = produto.getNomeProduto();
		this.descricaoProduto = produto.getDescricaoProduto();
		this.valorProduto = produto.getValorProduto();
		this.disponivelParaVenda = produto.getDisponivelParaVenda();
		
	}
}