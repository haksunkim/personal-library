package com.haksunkim.personallibrary.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration //marks the class as a source of bean definitions
@EnableConfigurationProperties //binds and validates the external configurations to a configuration class
@ConfigurationProperties //this annotation is used to enable @ConfigurationProperties annotated beans in the Spring application
public class YAMLConfig {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
