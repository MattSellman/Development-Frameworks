package br.com.example.java_spring_idea_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"br.com.example.controllers"})
public class JavaSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringExampleApplication.class, args);
	}

}
