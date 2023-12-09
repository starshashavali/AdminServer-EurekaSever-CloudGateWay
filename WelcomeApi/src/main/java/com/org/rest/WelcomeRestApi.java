package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome/api")
public class WelcomeRestApi {
	
	@GetMapping("/")
	public String getMsg() {
	return "Welcome to Bramaramba...";
}

}
