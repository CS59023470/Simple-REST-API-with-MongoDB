package com.example.demo.controller;
import java.util.*;

import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demorepository.ListRepository;

@RestController
public class CosmeticController {
	List<Cosmetic> cosmetic = new ArrayList<>();
	
	@Autowired
	private ListRepository repository;
	
	@GetMapping("/cosmetics")
	public List<Cosmetic> getAllCosmetic() {
		return repository.findAll();
	}
	
	@GetMapping("/cosmetics/delete")
	public List<Cosmetic> setListCosmetic(@RequestParam String id) {
		repository.deleteById(id);
		return repository.findAll();
	}
	
	@PostMapping("/cosmetics/request")
	public List<Cosmetic> addListCosmetic(@RequestBody Cosmetic cosmetics ){
		repository.save(cosmetics);
		return repository.findAll();
	}
}
