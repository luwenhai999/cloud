package com.tedu.sp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 我们在引入一个文件的时候,如果想要定义其前缀并利用setter而不是用value注入就可以用到下面这个CP注解
// @ConfigurationProperties(prefix="aga")
@EnableDiscoveryClient
@SpringBootApplication
public class Sp02ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sp02ItemServiceApplication.class, args);
	}

}
