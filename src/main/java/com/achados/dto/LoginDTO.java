package com.achados.dto;

import com.achados.entities.Login;

public class LoginDTO {

	private Long idLogin;
	private String email;
	private String senha;

	public LoginDTO() {

	}

	public LoginDTO(Long idLogin, String email, String senha) {

		this.idLogin = idLogin;
		this.email = email;
		this.senha = senha;
	}
     
	public LoginDTO(Login entidade) {

		idLogin = entidade.getIdLogin();
		email = entidade.getEmail();
		senha = entidade.getSenha();
	}
	
	public Long getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(Long idLogin) {
		this.idLogin = idLogin;
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
