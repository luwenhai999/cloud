package com.tedu.sp04;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class Sp04RoderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp04RoderserviceApplication.class, args);
	}

}
