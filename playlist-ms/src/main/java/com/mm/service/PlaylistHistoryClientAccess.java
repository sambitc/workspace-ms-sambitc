package com.mm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class PlaylistHistoryClientAccess {
	
	@Autowired
	public PlaylistHistoryClient phc;

	@HystrixCommand(fallbackMethod = "fallBackCall")
	@RequestMapping("/ph")
	public String getProduct() {
		return phc.getProduct();
	}
	
    public String fallBackCall() {
        
        return "Hii.. sevice called failed";
    }
}
