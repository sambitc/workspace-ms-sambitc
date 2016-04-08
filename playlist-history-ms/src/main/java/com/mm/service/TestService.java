package com.mm.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

	@RequestMapping(method = RequestMethod.GET, value = "/ph")
	public String getProduct() {
		System.out.println("++++++++++++++++++++ feign cliet server");
		return "Hello from ProductAPi";
	}

}
