package com.microServices.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication

public class MicroServicesStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesStudentApplication.class, args);
	}

}