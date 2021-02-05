package com.qureshi.demoSpring2;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private String brand;

	public Book(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Book [brand=" + brand + "]";
	}
	
	
}
