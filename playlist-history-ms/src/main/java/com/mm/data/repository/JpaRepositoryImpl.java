package com.mm.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.data.domain.Playlist;
import com.microservices.data.domain.PlaylistSongHistory;

@Repository
public interface JpaRepositoryImpl extends JpaRepository<PlaylistSongHistory, Long> {
	
	
	PlaylistSongHistory saveAndFlush(PlaylistSongHistory plh);
	

}
