package com.achados.dto;

import com.achados.entities.Usuario;

public class UsuarioDTO {
	
	private Long  id;
	private String email;
	private String senha;
	private String nome;
	private String sobrenome;
	private String telefone;
	private String img;
	

	public UsuarioDTO(Usuario usuario) {
	
	}

	public UsuarioDTO(Long id, String email, String senha, String nome, String sobrenome, String telefone, String img) {
	
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.img = img;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
