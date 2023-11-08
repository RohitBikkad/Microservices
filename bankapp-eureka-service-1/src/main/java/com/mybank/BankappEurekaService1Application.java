package com.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BankappEurekaService1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankappEurekaService1Application.class, args);
	}

}
