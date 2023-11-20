package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Faculty {
	private String name;
	private String address;
	protected List<Course> course;

	public Faculty(String name, String address, List<Course> course) {
		super();
		this.name = name;
		this.address = address;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Course getMaxPraticalCourse() {

		Course maxPraticalCourse = null;
		for (Course course : course) {
			if (course.getType().equals("TH")) {
				if (maxPraticalCourse == null) {
					return maxPraticalCourse = course;
				} else if (course.getStudent().size() > maxPraticalCourse.getStudent().size()) {
					maxPraticalCourse = course;
				}
			}
		}
		return maxPraticalCourse;
	}

	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> re = new HashMap<Integer, List<Student>>();
		 for (Course course : course) {
			for (Student student : course.getStudent()) {
				 List<Student> students = new ArrayList<Student>();
				for (Student student2 : students) {
					if(student.equal(student2)) {
						continue;
					}
					if(student.getYear()==student2.getYear()) {
						students.add(student);
						re.put(student.getYear(), students);
					}
				}
				
			}
		}
		return re;
	}

	public Set<Course> filterCourses(String type) {
		Set<Course> re = new HashSet<Course>();
		Course co = null;
		for (Course course : course) {
			if (!(course == null)) {
				co = course;
				if (!re.contains(co)) {
					continue;
				} else {
					re.add(co);
				}
			}

		}
		return re;
	}

}
