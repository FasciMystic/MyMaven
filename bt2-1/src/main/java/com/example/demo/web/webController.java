package com.example.demo.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class webController {
	
	
	@GetMapping("/")
	public String index() {
		return "卢东梅";
	}
	
	
	
	
	
	
}
