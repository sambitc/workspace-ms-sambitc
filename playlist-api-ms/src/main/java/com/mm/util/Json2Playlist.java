package com.mm.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mm.model.Playlist;

public class Json2Playlist {

	public static Playlist convertJson2Playlist(String playlistJson) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		Playlist playlist = mapper.readValue(playlistJson, Playlist.class);
		return playlist;
	}

}
