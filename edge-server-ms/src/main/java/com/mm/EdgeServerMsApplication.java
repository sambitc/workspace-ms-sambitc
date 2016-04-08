package com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableZuulProxy
@Controller
public class EdgeServerMsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EdgeServerMsApplication.class, args);
		new SpringApplicationBuilder(EdgeServerMsApplication.class).web(true).run(args);
	}
}
