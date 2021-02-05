package com.qureshi.demoSpring6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements Processor {

	public void getCPUModel() {
		System.out.println("Smap Model");
		
	}

	public void getCPUSpeed() {
		System.out.println("speeed is 1000Mbps");
		
	}

}
