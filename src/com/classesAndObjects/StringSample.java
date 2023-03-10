package com.classesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		
		String strOne = "Java";
		strOne = strOne + " Programming" ;
		System.out.println("Value of strOne : " + strOne);
		System.out.println("Value of strOne : " + strOne.hashCode());
		//Getting stored in new reference. So printing strOne will give the same.
		
//		strOne.concat(" Language");
		//But if we assign it to a string, will have new reference
		strOne = strOne.concat(" Language");
		
		System.out.println("Value of strOne after concat: " + strOne);
//		strOne = strOne.concat(" Language");
		System.out.println("Value of strOne : " + strOne.hashCode());
		
		String strTwo = new String("Functional Programming ");
		strTwo.concat("Language");
		System.out.println(strTwo);
		System.out.println(strTwo.length());
		System.out.println(strTwo.substring(10).trim().toUpperCase());
//		System.out.println(strTwo.trim());
		System.out.println("Value of strTwo : " + strTwo);
	}

}
