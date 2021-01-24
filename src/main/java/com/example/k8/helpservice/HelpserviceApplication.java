package com.example.k8.helpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients (basePackages="com.example.k8.helpservice.interconnect")
public class HelpserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpserviceApplication.class, args);
	}

}
