package com.achados.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class CadastroUsuario {
   
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_usuario")
	    private Long id;

	    private String nome;
	    private String sobrenome;
	    private String email;
	    
	    @Column(name = "n_telefone")
	    private String telefone;

	    @Column(name = "img_url")
	    private String imgUrl;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "id_login", unique = true)
	    private Login login;

		public CadastroUsuario() {
			
		}

		public CadastroUsuario(Long id, String nome, String sobrenome, String email, String telefone, String imgUrl,
				com.achados.entities.Login login) {
			
			this.id = id;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
			this.telefone = telefone;
			this.imgUrl = imgUrl;
			this.login = login;
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

		public Login getLogin() {
			return login;
		}

		public void setLogin(Login login) {
			this.login = login;
		}
		
		
        
	    
}
