package com.achados.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_item")
	private Long idItem;

	@Column(nullable = false, unique = true)
	private String nomeItem;

	@Column(nullable = false, unique = true)
	private String descricao;

	@Column(nullable = false, unique = true)
	private String imgUrl;

	@Column(nullable = false, unique = true)
	private String nomeQuemAchou;

	@Column(nullable = false, unique = true)
	private String local;

	@Column(nullable = false, unique = true)
	private LocalDate quandoAchou;

	@OneToOne(cascade = CascadeType.ALL)
	private ItemStatus itemStatus;

	public Item() {

	}

	public Item(Long idItem, String nomeItem, String descricao, String imgUrl, String nomeQuemAchou, String local,
			LocalDate quandoAchou) {

		this.idItem = idItem;
		this.nomeItem = nomeItem;
		this.descricao = descricao;
		this.imgUrl = imgUrl;
		this.nomeQuemAchou = nomeQuemAchou;
		this.local = local;
		this.quandoAchou = quandoAchou;
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getNomeQuemAchou() {
		return nomeQuemAchou;
	}

	public void setNomeQuemAchou(String nomeQuemAchou) {
		this.nomeQuemAchou = nomeQuemAchou;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public LocalDate getQuandoAchou() {
		return quandoAchou;
	}

	public void setQuandoAchou(LocalDate quandoAchou) {
		this.quandoAchou = quandoAchou;
	}

}
