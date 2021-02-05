package com.qureshi.demoSpring5;

import org.springframework.stereotype.Component;

@Component
public class Mediatek implements Processor {

	public void getProcess() {
		System.out.println("World second CPU");

	}

}
