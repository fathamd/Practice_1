package com.qureshi.demoSpring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	private String model;
	@Autowired
	private Processor processor;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public void config() {
		System.out.println("octa core process");
		processor.getProcess();
	}
	
	@Override
	public String toString() {
		return "Samsung [model=" + model + ", processor=" + processor + "]";
	}

	
}
