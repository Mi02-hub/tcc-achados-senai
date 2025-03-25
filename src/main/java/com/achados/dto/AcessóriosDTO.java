package com.achados.dto;

import com.achados.entities.Acessorios;


public class AcessóriosDTO {

	private Long id;
	private String nome;
	private String local;
	private String descricao;
	private String img;
	
	
	
	public AcessóriosDTO() {
		
	}



	public AcessóriosDTO(Long id, String nome, String local, String descricao, String img) {

		this.id = id;
		this.nome = nome;
		this.local = local;
		this.descricao = descricao;
		this.img = img;
	}



	public AcessóriosDTO(Acessorios lorena) {
		
		id = lorena.getId();
		nome = lorena.getNome();
		local = lorena.getLocal();
		descricao = lorena.getDescricao();
		img = lorena.getImg();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getLocal() {
		return local;
	}



	public void setLocal(String local) {
		this.local = local;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}

	
	
	
	}
	



	
	
	
	
	
	
