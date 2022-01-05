package homework;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Haktan";
		student.lastName = "Ba�ak";
		student.receivedCourse = "Java";
		
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin";
		instructor.lastName = "Demiro�";
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