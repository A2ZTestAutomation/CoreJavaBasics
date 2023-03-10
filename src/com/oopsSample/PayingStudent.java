package com.oopsSample;

public class PayingStudent extends Student {
	boolean madePayment;
	public PayingStudent(String name, float gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	public void gotoClass() {
		System.out.println("PayingStudent goto Next class...."+this.name);
	}
}
