package com.achados.controllers;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.achados.services.ItemService;

@RestController
@RequestMapping(value = "item")
public class ItemController {
   
	@Autowired
	private  ItemService itemService;
	
	
}
