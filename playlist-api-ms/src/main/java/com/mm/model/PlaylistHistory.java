package com.mm.model;

import java.io.Serializable;

public class PlaylistHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long id;

	String songName;

	String playlistName;

	String songDesc;

	String singer;

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public String getSongDesc() {
		return songDesc;
	}

	public void setSongDesc(String songDesc) {
		this.songDesc = songDesc;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public Long getId() {
		return id;
	}

}
