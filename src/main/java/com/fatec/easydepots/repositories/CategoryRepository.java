package com.fatec.easydepots.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.easydepots.entities.Category;



@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}

/* Component
//A annotation básica que indica que uma classe vai ser gerenciada pelo container do Spring. 
//Todas as annotations descritas acima são, na verdade, derivadas de @Component. 
A ideia é justamente passar mais semântica.*/
