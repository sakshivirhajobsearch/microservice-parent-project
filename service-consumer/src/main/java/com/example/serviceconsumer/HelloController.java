package com.example.serviceconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {
	
	@Autowired
	private HelloClient helloClient;

	@GetMapping("/consume")
	public String consumeService() {
		return helloClient.getHelloMessage();
	}
}