package com.example.k8.helpservice.interconnect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name="helloservice-svc")
public interface HelloServiceClient {
	
	@GetMapping(value = "/greet/{name}")
	@ResponseBody()
	public String sayHello(@PathVariable("name") final String name);

}
