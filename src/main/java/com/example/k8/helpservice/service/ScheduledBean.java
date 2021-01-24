package com.example.k8.helpservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.k8.helpservice.configs.AppConfiguration;

@Component
public class ScheduledBean {

	@Autowired
	private AppConfiguration myConfig;

	@Scheduled(fixedDelay = 5000)
	public void hello() {
		System.out.println("Message: " + this.myConfig.getMsg());
	}

}
