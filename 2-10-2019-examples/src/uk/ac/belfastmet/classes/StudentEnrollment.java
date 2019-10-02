package uk.ac.belfastmet.classes;

public class StudentEnrollment {
	
	public static void main(String[] args) {
		Student student1 = new Student("Martin",18);
		Student student2 = new Student("Jonny",21);
		Student student3 = new Student("Brian",25);
		System.out.println(Student.getNumberOfStudents());
	}
}
