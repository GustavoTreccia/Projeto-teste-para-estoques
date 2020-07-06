package com.fatec.easydepots.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fatec.easydepots.entities.Product;


@Component
public class ProductRepository {
	
	private Map<Long, Product> map = new HashMap<>();

	public void save (Product obj) {
		map.put(obj.getId(), obj);
	}
	
	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}
}

/* Component
//A annotation básica que indica que uma classe vai ser gerenciada pelo container do Spring. 
//Todas as annotations descritas acima são, na verdade, derivadas de @Component. 
A ideia é justamente passar mais semântica.*/
