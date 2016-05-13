package com.mm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Serializable {
	private static final long serialVersionUID = -2952735933715107252L;

	Long id;

	List<Song> songs = new ArrayList<Song>();

	String playlistName;

	String playlistDesc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public String getPlaylistDesc() {
		return playlistDesc;
	}

	public void setPlaylistDesc(String playlistDesc) {
		this.playlistDesc = playlistDesc;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

}
