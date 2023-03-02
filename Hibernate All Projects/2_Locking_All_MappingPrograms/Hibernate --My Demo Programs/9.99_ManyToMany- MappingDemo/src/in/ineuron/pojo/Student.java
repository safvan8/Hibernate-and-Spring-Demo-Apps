package in.ineuron.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//Step 2: coding Target class
@Entity
public class Student
{
	// 2.1: Declaring instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private Integer sage;

	// 2.2: declaring HAS-A variable (array of reference ) for Many to Many
	// association ( array required in the Target class )
	// array required when target class want's to receive multiple objects from
	// dependent class
	// in this case, Many is in Dependent class side , so we need to receive
	// multiple dependent objects from the dependent many side ,
	// for that we need an array on the Target side
	@ManyToMany(cascade = CascadeType.ALL)
	private java.util.Set<Course> courses; // plural for the array name

	// 2.3: Generating constructors to perform Constructor Injection
	public Student(String sname, Integer sage, java.util.Set<Course> courses)
	{
		this.sname = sname;
		this.sage = sage;
		// HAS-A Array of reference variable injection - through constructor
		this.courses = courses;
	}

	// to display the details of all students with courses they enrolled.
	public void getStudentAndCourseDetails()
	{
		System.out.println("********** STUDENT DETAILS ARE *********");
		System.out.println("SID:: " + sid);
		System.out.println(" SNAME :: " + sname);
		System.out.println("SAGE :: " + sage);

		System.out.println("\n**************COURSES TAKEN BY ABOVE  STUDENT IS ********");
		for (Course course : courses)
		{
			System.out.println("course id:: " + course.getCid());
			System.out.println("course name:: " + course.getCname());
			System.out.println("cost :: " + course.getCost());
			System.out.println();
		}
	}

}