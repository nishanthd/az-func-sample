package com.sample.az;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	@Autowired
	LoginService loginService;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public Function<String, String> login() {
		return s -> loginService.login(s);
	}
}