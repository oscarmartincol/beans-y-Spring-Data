package com.example.ejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");

		//Crear y almacenar coche en base de datos

		Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
		repository.save(toyota);

		//Recuperar todos
		System.out.println(repository.findAll());
	}

}
