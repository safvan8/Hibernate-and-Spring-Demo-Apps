package in.ineuron.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student_tab")
@NamedNativeQuery(name = "UPDATE_RECORDS", query = "UPDATE student_tab SET s_address='World' WHERE s_id =:input_id")
@NamedNativeQuery(name = "DELETE_RECORDS", query = "DELETE FROM student_tab WHERE s_id > :input_id")
public class Student
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "s_id")
	private Integer sid;

	@Column(name = "s_name", length = 30)
	private String sname;

	@Column(name = "s_address", length = 60)
	private String saddress;

	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}

}
