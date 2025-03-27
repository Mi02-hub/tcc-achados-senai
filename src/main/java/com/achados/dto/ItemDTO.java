package com.achados.dto;

import java.time.LocalDate;

import com.achados.entities.Item;

public class ItemDTO {

	private Long idItem;
	private String nomeItem;
	private String descricao;
	private String imgUrl;
	private String nomeQuemAchou;
	private String local;
	private LocalDate quandoAchou;

	public ItemDTO() {

	}

	public ItemDTO(Long idItem, String nomeItem, String descricao, String imgUrl, String nomeQuemAchou, String local,
			LocalDate quandoAchou) {
	
		this.idItem = idItem;
		this.nomeItem = nomeItem;
		this.descricao = descricao;
		this.imgUrl = imgUrl;
		this.nomeQuemAchou = nomeQuemAchou;
		this.local = local;
		this.quandoAchou = quandoAchou;
	}
	
	
	public ItemDTO(Item entidade) {
	
	    idItem = entidade.getIdItem();
		nomeItem = entidade.getNomeItem();
		descricao = entidade.getDescricao();
	    imgUrl = entidade.getImgUrl();
		nomeQuemAchou = entidade.getNomeQuemAchou();
	    local = entidade.getLocal();
		quandoAchou = entidade.getQuandoAchou();
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
