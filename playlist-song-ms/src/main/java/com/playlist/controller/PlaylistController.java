package com.playlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.data.domain.Playlist;
import com.playlist.data.repository.PlaylistRepository;

@RestController
public class PlaylistController {

	private PlaylistRepository playlistRepo;

	@Autowired
	public PlaylistController(PlaylistRepository playlistRepo) {
		this.playlistRepo = playlistRepo;
	}

	@RequestMapping("/allPlaylist")
	public List<Playlist> getAllPlaylist() {
		return playlistRepo.findAll();
	}

	@RequestMapping("/playlist/{id}")
	public Playlist findById(@PathVariable("id") Long id) {
		return playlistRepo.findById(id);
	}
}
