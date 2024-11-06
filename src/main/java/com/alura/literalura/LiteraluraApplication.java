package com.alura.literalura;

import com.alura.literalura.app.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alura.literalura.repository.LibroRepository;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(LiteraluraApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		App app = new App(repository);
		App.mostrarMenu();
	}
}
