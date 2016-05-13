package com.mm.service.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("playlist-song")
public interface PlaylistSongClient {

	@RequestMapping(method = RequestMethod.GET, value = "/allPlaylist")
	public String getAllPlaylist();

	@RequestMapping(method = RequestMethod.GET, value = "/playlist/{id}")
	public String findById(@PathVariable("id") Long id);

}
