package com.playlist;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.microservices.data.domain.Playlist;

@SpringCloudApplication
@ComponentScan(basePackages = { "com.playlist.config", "com.playlist.data", "com.microservices.data","com.playlist.controller"})
public class PlaylistSongMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistSongMsApplication.class, args);
	}
	
    @Autowired
    private RepositoryRestMvcConfiguration repositoryRestConfiguration;

    @PostConstruct
    public void postConstructConfiguration() {
        repositoryRestConfiguration.config().exposeIdsFor(Playlist.class);
    }
}
