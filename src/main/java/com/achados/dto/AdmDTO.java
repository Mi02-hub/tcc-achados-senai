package com.achados.dto;

import com.achados.entities.Adm;

public class AdmDTO {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	public AdmDTO() {
		
	}
	
	public AdmDTO(Long id, String nome, String email, String senha) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
    public AdmDTO(Adm i) {
		
		id = i.getId();
	    nome = i.getNome();
	    email = i.getEmail();
		senha = i.getSenha();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
