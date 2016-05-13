package com.mm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.data.domain.PlaylistSongHistory;
import com.mm.data.repository.JpaRepositoryImpl;

@RestController
public class PlaylistHistoryController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PlaylistHistoryController.class);

	private JpaRepositoryImpl phRepository;

	@Autowired
	public PlaylistHistoryController(JpaRepositoryImpl phRepository) {
		this.phRepository = phRepository;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody PlaylistSongHistory playlistHistory) {
		
		// trace
		LOG.info("------playlisthistorycontroller().save....... called");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		phRepository.save(playlistHistory);

	}

}
