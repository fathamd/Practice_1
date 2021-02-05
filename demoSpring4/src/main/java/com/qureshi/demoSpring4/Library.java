package com.qureshi.demoSpring4;

import org.springframework.stereotype.Component;

@Component
public class Library {
	
	private String rollNum;
	private String Book;
	
	public String getRollNum() {
		return rollNum;
	}
	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
	@Override
	public String toString() {
		return "Library [rollNum=" + rollNum + ", Book=" + Book + "]";
	}
}