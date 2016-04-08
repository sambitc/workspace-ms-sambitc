package com.mm.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("playlist-history")
public interface PlaylistHistoryClient {
	
	@RequestMapping(method=RequestMethod.GET, value="/ph")
	public String getProduct();

}
