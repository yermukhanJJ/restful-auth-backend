package com.example.myuniver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.myuniver"})
public class MyuniverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyuniverApplication.class, args);
	}

}
