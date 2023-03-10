package com.oopsSample;

import java.util.ArrayList;

import com.oopsSample.Student;

public class StudentDriver {

	
	public static void main(String[] args) {
//		Student s1 = new Student("Peter");
		Student s1 = new PayingStudent("Peter", 9.5f);
		Student s3  = new PayingStudent("Vicky", 8.7f);
		Student s2 = new CompanyStudent("John", "Zuci");
		Student s4 = new CompanyStudent("Raj" , "Zuci");
		Student s5 = new AuditStudent("Henry", "Auditoriam1");
		StudentList students = new StudentList();
		students.addStudent(s1);
		students.addStudent(s2);
		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		
		System.out.println("Object of s5...."+s5.toString());
	
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs) {
			
			stud.gotoClass();
		}
		
	}

}
