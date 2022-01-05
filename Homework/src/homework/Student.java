package homework;
public class Student extends User {
	String receivedCourse;

	public Student() {

	}

	public Student(String receivedCourse) {
		this.receivedCourse = receivedCourse;
	}

	public String getReceivedCourse() {
		return receivedCourse;
	}

	public void setReceivedCourse(String receivedCourse) {
		this.receivedCourse = receivedCourse;
	}
}