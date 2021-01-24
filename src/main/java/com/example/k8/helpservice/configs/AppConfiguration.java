package com.example.k8.helpservice.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "helpservice.changeable.greet")
public class AppConfiguration {

	private String msg = "a message that can be changed live";

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String message) {
		this.msg = message;
	}

}
