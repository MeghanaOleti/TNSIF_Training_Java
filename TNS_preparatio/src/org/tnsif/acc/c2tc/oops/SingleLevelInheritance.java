package org.tnsif.acc.c2tc.oops;
//parent class
class Course{
	String courseName ="Java Progaraming";
	void showCourse() {
		System.out.println("Course :"+courseName);
	}
}
//sub class
class Student extends Course{
	String name ="Meghana";
	void showStudent() {
		System.out.println("Sudent :"+name);
	}
}
public class SingleLevelInheritance {
	public static void main (String[] args) {
		Student student = new Student();
		student.showStudent();
		student.showStudent();
	}

}
