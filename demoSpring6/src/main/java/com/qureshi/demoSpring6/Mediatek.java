package com.qureshi.demoSpring6;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements Processor {

	public void getCPUModel() {
		System.out.println("Media Model");
		
	}

	public void getCPUSpeed() {
		System.out.println("speed is 500kbps");
		
	}

}
