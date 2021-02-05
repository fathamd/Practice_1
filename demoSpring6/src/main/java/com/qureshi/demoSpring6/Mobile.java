package com.qureshi.demoSpring6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	private String brand;
	@Autowired
	private Processor processor;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Samsung [brand=" + brand + ", processor=" + processor + "]";
	}
}
