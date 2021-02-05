package com.qureshi.demoSpring7;

import org.springframework.context.annotation.Primary;

@Primary
public class Snapdragon implements Processor {

	public void getProcessorName() {
		System.out.println("Model name is Snapdragon");
	}

	public void getProcessorSpeed() {
		System.out.println("Speed is 1000Mbps");
	}

}
