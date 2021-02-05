package com.qureshi.demoSpring5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragone implements Processor {

	public void getProcess() {
		System.out.println("world 1st CPU");

	}

}
