package in.ineuron.bean;

import java.util.Set;

public class EngCourse {
	private Set<String> subjects;
	
	static {
		System.out.println("EngCourse.class file is loading...");System.out.println();
	}
	public EngCourse() {
		System.out.println("EngCourse object is instantiated:: ZEROPARAM constructor...");
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EngCourse [subjects=" + subjects + "]";
	}

}
