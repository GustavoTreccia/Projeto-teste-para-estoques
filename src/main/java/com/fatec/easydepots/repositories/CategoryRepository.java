package com.fatec.easydepots.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.fatec.easydepots.entities.Category;

// Component
// A annotation básica que indica que uma classe vai ser gerenciada pelo container do Spring. 
// Todas as annotations descritas acima são, na verdade, derivadas de @Component. 
// A ideia é justamente passar mais semântica.
@Component
public class CategoryRepository {
	
	private Map<Long, Category> map = new HashMap<>();

	public void save (Category obj) {
		map.put(obj.getId(), obj);
	}
	
	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
	}
}
