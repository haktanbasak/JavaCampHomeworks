package homework;
public class Instructor extends User{

	String givenCourse;
	
	public Instructor() {
		
	}
	
	public Instructor(String givenCourse) {
		this.givenCourse = givenCourse;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
}