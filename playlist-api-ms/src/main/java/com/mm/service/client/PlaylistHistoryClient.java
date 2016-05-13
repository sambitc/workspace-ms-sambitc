package com.mm.service.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mm.model.PlaylistHistory;


@FeignClient("playlist-history")
public interface PlaylistHistoryClient {

//	@RequestMapping(method = RequestMethod.GET, value = "/ph")
//	public String getProduct();

	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void save(PlaylistHistory ph);

}
