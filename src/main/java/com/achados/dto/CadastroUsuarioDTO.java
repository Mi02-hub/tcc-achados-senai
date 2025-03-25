package com.achados.dto;

import com.achados.entities.CadastroUsuario;

public class CadastroUsuarioDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;
	private String imgUrl;

	public CadastroUsuarioDTO() {

	}

	public CadastroUsuarioDTO(Long id, String nome, String sobrenome, String email, String telefone, String imgUrl) {

		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.imgUrl = imgUrl;
	}
	
	public CadastroUsuarioDTO(CadastroUsuario entidade) {

		id = entidade.getId();
		nome = entidade.getNome();
		sobrenome = entidade.getSobrenome();
	    email = entidade.getEmail();
	    telefone = entidade.getTelefone();
		imgUrl = entidade.getImgUrl();
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
