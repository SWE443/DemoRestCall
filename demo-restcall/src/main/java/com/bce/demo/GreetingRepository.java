package com.bce.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends 
	CrudRepository<Greeting, Long> {

		  List<Greeting> findByContent(String content);

		  Optional<Greeting> findById(Long id);
}
