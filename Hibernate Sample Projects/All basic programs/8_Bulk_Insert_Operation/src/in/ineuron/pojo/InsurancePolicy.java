package in.ineuron.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurancepolicy")
public class InsurancePolicy implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long policyId;

	@Column(length = 20)
	private String policyName;

	@Column(length = 20)
	private String policyType;

	@Column(length = 20)
	private String company;

	@Column(length = 30)
	private Integer tenure;

	@Override
	public String toString()
	{
		return "InsurancePolicy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", company=" + company + ", tenure=" + tenure + "]";
	}

}
