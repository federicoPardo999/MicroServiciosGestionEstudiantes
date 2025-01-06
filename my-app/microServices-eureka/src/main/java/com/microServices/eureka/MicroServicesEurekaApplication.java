package com.microServices.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroServicesEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesEurekaApplication.class, args);
	}

}
