package com.example.testingweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// https://mkyong.com/spring-boot/spring-boot-slf4j-logging-example/

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);

		logger.debug("Hello from Logback {}", data);
		return "Hello, World";
	}

}
