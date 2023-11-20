package Task1;

import java.util.List;

public class Course {
	private String id;
	private String title;
	private String type;
	private List<Student> student;
	private String lecture;
	private Faculty faculty;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Course(String id, String title, String type, List<Student> student, String lecture, Faculty faculty) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.student = student;
		this.lecture = lecture;
		this.faculty = faculty;
	}

	
}
