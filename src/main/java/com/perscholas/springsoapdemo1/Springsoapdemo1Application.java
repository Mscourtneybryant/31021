package com.perscholas.springsoapdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

package com.perscholasMicroservice.EurekaServerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableEurekaServer

@SpringBootApplication
public class Springsoapdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsoapdemo1Application.class, args);
	}

}
