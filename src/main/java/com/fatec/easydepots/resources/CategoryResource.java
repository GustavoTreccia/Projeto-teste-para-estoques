package com.fatec.easydepots.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.easydepots.entities.Category;
import com.fatec.easydepots.repositories.CategoryRepository;

// RequestMapping == Geralmente utilizada em cima dos métodos de uma classe anotada com @Controller. 
// Serve para você colocar os endereços da sua aplicação que, quando acessados por algum cliente
// deverão ser direcionados para o determinado método.

// Autowired == Anotação utilizada para marcar o ponto de injeção na sua classe. 
// Você pode colocar ela sobre atributos ou sobre o seu construtor com argumentos.

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}


