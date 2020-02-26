package com.example.demo.herocontroller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.herorepository.HeroRepository;


@RestController
public class HeroController {
	List<Hero> hero = new ArrayList<>();
	
	@Autowired
	private HeroRepository repository;
	
	@GetMapping("/hero")
	public List<Hero> getAllHero() {
		return repository.findAll();
	}
	
	@PostMapping("/hero/add")
	public List<Hero> addHero(@RequestBody Hero hero) {
		repository.save(hero);
		return repository.findAll();
	}
	
	@GetMapping("/hero/exam")
	public List<Hero> getExamHero() {
		
		return repository.findAll();
	}
}
