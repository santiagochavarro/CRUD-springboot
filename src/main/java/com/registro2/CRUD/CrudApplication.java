package com.registro2.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Configura el proyecto y escanea los componentes (Controller, Service, etc.)
public class CrudApplication {

	public static void main(String[] args) {
		// Inicia la aplicación (Main principal)
		SpringApplication.run(CrudApplication.class, args);
	}

}