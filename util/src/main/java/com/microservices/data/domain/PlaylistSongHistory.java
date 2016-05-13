package com.microservices.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "playlist_song_history")
public class PlaylistSongHistory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	Long id;

	@Column(name = "song_name")
	String songName;

	@Column(name = "playlist_name")
	String playlistName;

	@Column(name = "song_desc")
	String songDesc;

	@Column(name = "singer")
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
