package com.qureshi.demoSpring3;

public class Book {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Book [subject=" + subject + "]";
	}
}
