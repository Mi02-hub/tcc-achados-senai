package com.achados.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_login")
public class Login {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_login")
	    private Long idLogin;

	    @Column(nullable = false, unique = true)
	    private String email;

	    @Column(nullable = false)
	    private String senha;

	    
	    @OneToOne(mappedBy = "login")  
	    private CadastroAdm cadastroAdm;
	     
	    @OneToOne(mappedBy = "login")
	    @JsonBackReference
	    private CadastroUsuario cadastroUsuario;


		public Login() {
			
		}


		public Login(Long idLogin, String email, String senha, CadastroAdm cadastroAdm,
				CadastroUsuario cadastroUsuario) {
		
			this.idLogin = idLogin;
			this.email = email;
			this.senha = senha;
			this.cadastroAdm = cadastroAdm;
			this.cadastroUsuario = cadastroUsuario;
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


		public CadastroAdm getCadastroAdm() {
			return cadastroAdm;
		}


		public void setCadastroAdm(CadastroAdm cadastroAdm) {
			this.cadastroAdm = cadastroAdm;
		}


		public CadastroUsuario getCadastroUsuario() {
			return cadastroUsuario;
		}


		public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
			this.cadastroUsuario = cadastroUsuario;
		}
		
		
	    
	    

}
