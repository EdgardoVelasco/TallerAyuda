package com.bancolombia.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroCarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCarritoApplication.class, args);
	}

}
