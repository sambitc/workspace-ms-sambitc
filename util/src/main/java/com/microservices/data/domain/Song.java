package com.microservices.data.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "songs")
public class Song implements Serializable{

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

	@Column(name = "song_desc")
	String songDesc;

	@Column(name = "duration")
	int duration;

	@Column(name = "singer")
	String singer;

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSongDesc() {
		return songDesc;
	}

	public void setSongDesc(String songDesc) {
		this.songDesc = songDesc;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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
