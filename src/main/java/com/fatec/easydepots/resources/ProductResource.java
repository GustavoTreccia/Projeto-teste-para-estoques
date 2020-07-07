package com.fatec.easydepots.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.easydepots.entities.Product;
import com.fatec.easydepots.repositories.ProductRepository;

// RequestMapping == Geralmente utilizada em cima dos métodos de uma classe anotada com @Controller. 
// Serve para você colocar os endereços da sua aplicação que, quando acessados por algum cliente
// deverão ser direcionados para o determinado método.

// Autowired == Anotação utilizada para marcar o ponto de injeção na sua classe. 
// Você pode colocar ela sobre atributos ou sobre o seu construtor com argumentos.

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}


