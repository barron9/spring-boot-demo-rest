package com.example.demo.Kontroler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kontrolcu {

	@RequestMapping("/s")
	public String home() {
		return "testing..";
	}
	
	
}
