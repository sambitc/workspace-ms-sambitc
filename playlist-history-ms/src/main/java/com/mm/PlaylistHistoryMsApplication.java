package com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients
@ComponentScan(basePackages = { "com.mm.config", "com.mm.data", "com.microservices.data","com.mm.controller"})
public class PlaylistHistoryMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistHistoryMsApplication.class, args);
	}
}
