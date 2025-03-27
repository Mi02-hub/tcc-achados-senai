package com.achados.services;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.achados.dto.ItemDTO;
import com.achados.entities.Item;
import com.achados.repositories.ItemRepository;

import jakarta.transaction.Transactional;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public Item salvar(Item item) {
		return itemRepository.save(item);
	}

	public Optional<Item> buscarPorId(Long id) {
		return itemRepository.findById(id);
	}

	public Item atualizar(Long id, Item itemAtualizado) {
		if (!itemRepository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item não encontrado :(");
		}

		itemAtualizado.setIdItem(id);
		return itemRepository.save(itemAtualizado);
	}

	@Transactional
	public ItemDTO inserir(ItemDTO dto) {
		Item item = new Item();
		item.setDescricao(dto.getDescricao());
		item.setNomeItem(dto.getNomeItem());
		item.setNomeQuemAchou(dto.getNomeQuemAchou());
		item.setQuandoAchou(dto.getQuandoAchou());
		item.setImgUrl(dto.getImgUrl());
		item.setLocal(dto.getLocal());

		item = itemRepository.save(item);
		return new ItemDTO(item);
	}
	
	public void deletar(Long id) {
		if (!itemRepository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item não encontrado :(");
		}
		itemRepository.deleteById(id);
	}

}
