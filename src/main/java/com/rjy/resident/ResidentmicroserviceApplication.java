package com.rjy.resident;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ResidentmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResidentmicroserviceApplication.class, args);
	}

}
