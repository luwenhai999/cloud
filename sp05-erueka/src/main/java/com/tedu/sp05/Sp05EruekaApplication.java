package com.tedu.sp05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Sp05EruekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp05EruekaApplication.class, args);
	}

}
