package com.vz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	//private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String printData() {
		return "Hello World";

	}
}
