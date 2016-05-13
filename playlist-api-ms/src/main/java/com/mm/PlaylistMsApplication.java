package com.mm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.mm.service.client")
@EnableHystrix
@ComponentScan("com.mm.service")
public class PlaylistMsApplication {

	private static final Logger LOG = LoggerFactory.getLogger(PlaylistMsApplication.class);

	@Value("${app.rabbitmq.host:localhost}")
	String rabbitMqHost;

	@Bean
	public ConnectionFactory connectionFactory() {
		LOG.info("Create RabbitMqCF for host: {}", rabbitMqHost);
		System.out.println("rabbitMqHost================="+rabbitMqHost);
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(rabbitMqHost);
		connectionFactory.setUsername("sambitc");
		connectionFactory.setPassword("mindfire");
		return connectionFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(PlaylistMsApplication.class, args);
	}
}
