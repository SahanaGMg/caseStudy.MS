package com.cropdeal.crops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableEurekaClient
public class CropsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropsMsApplication.class, args);
	}

}
