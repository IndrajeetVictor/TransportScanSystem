package com.transportscan.microservices.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages= {"com.transportscan.controllers","com.transportscan.services"})
public class TransportScanSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportScanSystemApplication.class, args);
	}
}
