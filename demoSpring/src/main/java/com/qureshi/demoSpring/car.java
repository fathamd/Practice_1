package com.qureshi.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class car implements vehicle {
	@Autowired
	private Tyre Tyre;
	
	public Tyre getTyre() {
		return Tyre;
	}

	public void setTyre(Tyre tyre) {
		Tyre = tyre;
	}

	public void drive() {
		System.out.println("car is riding " + "Tyre=" +Tyre);
	}
	


}
