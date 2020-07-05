package com.fatec.easydepots;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.easydepots.entities.Category;
import com.fatec.easydepots.repositories.CategoryRepository;

@SpringBootApplication
public class EasydepotsApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EasydepotsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Eletrônicos");
		Category cat2 = new Category(2L, "Móveis");
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
	}

}
