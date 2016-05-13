package com.mm.util;

import java.util.ArrayList;
import java.util.List;

import com.mm.model.Playlist;
import com.mm.model.PlaylistHistory;
import com.mm.model.Song;

public class Util {

	public static List<PlaylistHistory> playlistToPlaylistHistory(Playlist playlist) {
		PlaylistHistory playlistHistory = null;
		Song song = null;
		List<PlaylistHistory> playlistHistoryList = new ArrayList<>();

		List<Song> songList = playlist.getSongs();
		int songSize = songList.size();

		for (int i = 0; i < songSize; i++) {
			song = songList.get(i);
			playlistHistory = new PlaylistHistory();

			playlistHistory.setPlaylistName(playlist.getPlaylistName());
			playlistHistory.setSongName(song.getSongName());
			playlistHistory.setSongDesc(song.getSongDesc());
			playlistHistory.setSinger(song.getSinger());

			// Add
			playlistHistoryList.add(playlistHistory);
		}

		return playlistHistoryList;
	}

}
