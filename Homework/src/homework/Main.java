package homework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Haktan";
		student.lastName = "Baþak";
		student.receivedCourse = "Java";
		
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroð";
		instructor.givenCourse = "C#";
		
		UserManager um = new UserManager();
		um.login(student);
		um.login(instructor);
		
		StudentManager sm = new StudentManager();
		sm.joinToCourse(student);
		
		InstructorManager im  = new InstructorManager();
		im.addCourse(instructor);
	}

}