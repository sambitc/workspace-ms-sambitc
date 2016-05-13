package com.playlist.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.data.domain.Playlist;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

	List<Playlist> findAll();

	Playlist findById(Long id);
}
