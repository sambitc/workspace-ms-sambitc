package com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients(basePackages="com.mm.service")
@EnableHystrix
@ComponentScan("com.mm.service")
public class PlaylistMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistMsApplication.class, args);
	}
}
