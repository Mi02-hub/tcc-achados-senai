package com.achados.dto;

import com.achados.entities.Objetos;

public class ObjetosDTO {

	private Long id;
	private String nome;
	private String descricao;
	private String img;
	private String local;
	
	
	public ObjetosDTO() {
		
	}


	public ObjetosDTO(Long id, String nome, String descricao, String img, String local) {
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.img = img;
		this.local = local;
	}


	public ObjetosDTO(Objetos lorena) {
		
		id = lorena.getId();
		nome = lorena.getNome();
		descricao = lorena.getDescricao();
		img = lorena.getImg();
		local = lorena.getLocal();
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


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
	
	
	
	
}
