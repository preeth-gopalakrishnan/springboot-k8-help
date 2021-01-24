package com.example.k8.helpservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.k8.helpservice.interconnect.HelloServiceClient;

@RestController()
public class HelpController {

	@Value("${helpservice.greet.msg}") 
	private String msg;
	
	@Autowired
	private HelloServiceClient client;
	
	
	@GetMapping(value = "/request/{name}")
	@ResponseBody()
	public String help(@PathVariable String name) {
		String greetMsg = client.sayHello(name);
		return greetMsg +"\n"+msg;
	}
}
