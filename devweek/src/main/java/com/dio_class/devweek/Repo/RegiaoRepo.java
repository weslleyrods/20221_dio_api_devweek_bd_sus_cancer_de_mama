package com.dio_class.devweek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio_class.devweek.Entity.Regiao;

//cria um controller com o padrão REST, 
//para conseguir pegar e criar anotações relacionadas ao REST, como por exemplo, os métodos http
//@RestController
public interface RegiaoRepo extends JpaRepository<Regiao, Long>{
	

}
