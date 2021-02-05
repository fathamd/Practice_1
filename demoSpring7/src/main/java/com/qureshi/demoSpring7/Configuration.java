package com.qureshi.demoSpring7;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public Mobile getBrand() {
		return new Mobile();
	}
//	@Bean
//	public Processor getProcessorName() {
//		return new Snapdragon();
//	}
	@Bean
	public Processor getProcessorSpeed() {
		return new Mediatek();
	}
	


}
