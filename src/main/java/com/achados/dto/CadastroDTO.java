package com.achados.dto;

import com.achados.entities.Cadastro;

public class CadastroDTO {
	
	private Long id;
	private String email;
	private String senha;
	private String nome;
	private String sobrenome;
	
	
	
	public CadastroDTO() {
		
	}
	
	public CadastroDTO(Long id, String email, String senha, String nome, String sobrenome) {
		
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public CadastroDTO(Cadastro i) {
		
		id = i.getId();
		email = i.getEmail();
		senha = i.getSenha();
		nome = i.getNome();
		sobrenome = i.getSobrenome();
	}
	


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}




	

}
