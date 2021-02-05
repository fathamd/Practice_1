package com.qureshi.demoSpring6;

import org.springframework.stereotype.Component;

@Component
public interface Processor {
	void getCPUModel();
	void getCPUSpeed();

}
