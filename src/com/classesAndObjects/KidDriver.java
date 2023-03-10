package com.classesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		
//		Kid kidOne = new Kid();
		Kid kidOne = new Kid("Pinky", 8);
		kidOne.play();
		
		Kid kidTwo = new Kid("Wicky", 8);
//		System.out.println(kidTwo.name);
		kidTwo.play();
		kidTwo.printKid(10);
		System.out.println("All kids are in " +Kid.studyClass);
	
//		
//		EncapsulatedKid kid = new EncapsulatedKid();
//		kid.setAge(10);
	}

}
