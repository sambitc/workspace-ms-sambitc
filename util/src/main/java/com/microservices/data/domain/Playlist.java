package com.microservices.data.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "playlist")
public class Playlist implements Serializable {
	private static final long serialVersionUID = -2952735933715107252L;

	@Id
	@Column(name = "id")
	@GeneratedValue
	Long id;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "playlist_song", inverseJoinColumns = {
			@JoinColumn(name = "song_id_fk", referencedColumnName = "id") }, joinColumns = {
					@JoinColumn(name = "playlist_id_fk", referencedColumnName = "id") })
	@RestResource(exported = true)
	List<Song> songs = new ArrayList<Song>();

	@Column(name = "playlist_name")
	String playlistName;

	@Column(name = "playlist_desc")
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
