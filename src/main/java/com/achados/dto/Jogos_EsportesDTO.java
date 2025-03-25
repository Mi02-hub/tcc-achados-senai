package com.achados.dto;

import com.achados.entities.Jogos_Esportes;

public class Jogos_EsportesDTO {
	
	private Long id;
	private String nome;
	private String local;
	private String descricao;
	private String img;
	
	
	public Jogos_EsportesDTO() {
	}


	public Jogos_EsportesDTO(Long id, String nome, String local, String descricao, String img) {
		
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.descricao = descricao;
		this.img = img;

	}


	public Jogos_EsportesDTO(Jogos_Esportes l) {
		
		id = l.getId();
		nome = l.getNome();
		descricao = l.getDescricao();
		img = l.getImg();
		local = l.getLocal();
		

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
