package uk.ac.belfastmet.classes;

public class Student {
	private String name;
	private int age;
	
	public static int numberOfStudents;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		numberOfStudents++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
}
