package com.cice.cicezuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CiceZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiceZuulServerApplication.class, args);
	}

}
