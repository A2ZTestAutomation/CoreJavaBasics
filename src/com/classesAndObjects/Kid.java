package com.classesAndObjects;

import java.util.Date;

public class Kid {
	
	static String studyClass = "KinderGarden";
	 String name;
	 int age;
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void play() {
		System.out.println(this.name +" is playing....");
		printKid(this.name);
	}
	public void printKid(String name) {
		System.out.println("Name of Kid is : " + this.name + "and Age is : " + this.age);
	}
	public void printKid(int studying) {
		System.out.println("Kid is studying in : "+ studying);
	}
	
	public void printKid(String name, int age) {
		System.out.println("Kid is studying in : ");
	}
	public void printKid(Date dob) {
		
	}
	
}
