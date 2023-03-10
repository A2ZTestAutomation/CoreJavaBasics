package com.oopsSample;

public class AuditStudent extends Student{

	String classLoc;
	String name;
	public AuditStudent(String name, String classLoc) {
		
		this.classLoc = classLoc;
		this.name = name;
		
	}
	public void gotoClass() {
//		super.gotoClass();
		System.out.println("Audit student goto class -> AuditoriamOne");
	}
	
	
	
	public String toString() {
		
		String strObj = "AuditStudent name is "+this.name; 
		return strObj;
		
	}
}
