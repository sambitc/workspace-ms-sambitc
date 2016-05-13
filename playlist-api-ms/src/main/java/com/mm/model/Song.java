package com.mm.model;

import java.io.Serializable;

public class Song implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long id;

	String songName;

	String songDesc;

	int duration;

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
