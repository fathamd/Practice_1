package com.qureshi.demoSpring7;

public class Hello {
	final static int x;
	static {
		x=20;
		System.out.println("static block");
	}
}
class qq46{
	public static void main(String[] args) {
System.out.println(Hello.x);

	}

}
