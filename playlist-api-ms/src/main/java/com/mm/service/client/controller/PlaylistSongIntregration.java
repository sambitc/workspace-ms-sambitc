package com.mm.service.client.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.mm.model.Playlist;
import com.mm.model.PlaylistHistory;
import com.mm.service.client.PlaylistHistoryClient;
import com.mm.service.client.PlaylistSongClient;
import com.mm.util.Json2Playlist;
import com.mm.util.Util;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class PlaylistSongIntregration {
	
	private static final Logger LOG = LoggerFactory.getLogger(PlaylistSongIntregration.class);

	@Autowired
	public PlaylistSongClient playlistSongClient;

	@Autowired
	public PlaylistHistoryClient phc;
	
	
//	String playlistHistoryUrl = "http://playlist-history/save/";
	
    @Autowired
    private LoadBalancerClient loadBalancer;
    
    RestTemplate restTemplate = new RestTemplate();


//    @Inject
//    @Qualifier("loadBalancedRestTemplate")
//    private RestOperations restTemplate;
	

	@HystrixCommand(fallbackMethod = "fallBackCall")
	@RequestMapping("/allPlaylist")
	public String getAllPlaylist() {
		return playlistSongClient.getAllPlaylist();
	}

//	@HystrixCommand(fallbackMethod = "fallBackPlaylist")
	@RequestMapping("/playlist/{id}")
	public String findById(@PathVariable("id") Long id) throws JsonParseException, JsonMappingException, IOException {

		// Get
		String playlistJson = playlistSongClient.findById(id);

		Playlist playlist = Json2Playlist.convertJson2Playlist(playlistJson);
		List<PlaylistHistory> playlistHistoryList = Util.playlistToPlaylistHistory(playlist);
		
		// Load balancer
		ServiceInstance serviceInstance = loadBalancer.choose("playlist-history");
		String playlistHistoryUrl = serviceInstance.getUri().toString() + "/save";
		
		LOG.info("url----" + playlistHistoryUrl);

		// Insert playlist history
		int i =0;
		for (PlaylistHistory plh : playlistHistoryList) {
			//phc.save(plh);
			restTemplate.postForEntity(playlistHistoryUrl, phc, PlaylistHistory.class);
			
			i++;
			
			if(i==1)break;
		}

		return playlistJson;
	}

	public String fallBackPlaylist(Long id) {
		return "Hii.. playlist song sevice by id called failed";
	}

	public String fallBackCall() {
		return "Hii.. playlist song sevice called failed";
	}
}
