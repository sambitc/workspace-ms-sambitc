package com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
@SpringBootApplication
@EnableDiscoveryClient
public class PlaylistHistoryMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistHistoryMsApplication.class, args);
	}
}
