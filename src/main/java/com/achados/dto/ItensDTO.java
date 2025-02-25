package com.achados.dto;

import com.achados.entities.Itens;

public class ItensDTO {

	private Long id;
	private String nome;
	private String descricao;
	private String img;
	private String local;
	

	public ItensDTO() {

	}


	public ItensDTO(Long id, String nome, String descricao, String img, String local) {
	
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.img = img;
		this.local = local;
	}
	

	public ItensDTO(Itens i) {
	    
		id = i.getId();
		nome = i.getNome();
		descricao = i.getDescricao();
		img = i.getImg();
		local = i.getLocal();
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
