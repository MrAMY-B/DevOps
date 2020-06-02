package com.amy.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Greetings")
public class ApplicationController {

	@GetMapping("/hi")
	public String replyOnHi() {
		return "Hello";
	}
	
	@GetMapping("/hello")
	public String replyOnHello() {
		return "Hello there!, How are you";
	}
	
	@GetMapping("/fine")
	public String replyOnNice() {
		return "Ohh thats good.";
	}
	@GetMapping("/hmm")
	public String replyOnHmm() {
		return "As a Human being we donts used , This hmm is usually used by cows :) :D ..... Try always not to use this again.. Have a nice day,";
	}
	@GetMapping("/Bye")
	public String replyOnBye() {
		return "Bye bye! See you soon....";
	}
}
