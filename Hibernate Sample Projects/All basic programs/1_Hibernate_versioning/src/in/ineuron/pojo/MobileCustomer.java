package in.ineuron.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "mobile_customers_info")
public class MobileCustomer implements Serializable
{
	// auto geneation of customer ID for Oracle DB
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer cId;

	private String cName;

	private String mobNo;

	private String callerTune;

	// for Vesioning
	@Version
	private Integer vesionCount;

	public Integer getcId()
	{
		return cId;
	}

	public void setcId(Integer cId)
	{
		this.cId = cId;
	}

	public String getcName()
	{
		return cName;
	}

	public void setcName(String cName)
	{
		this.cName = cName;
	}

	public String getMobNo()
	{
		return mobNo;
	}

	public void setMobNo(String mobNo)
	{
		this.mobNo = mobNo;
	}

	public String getCallerTune()
	{
		return callerTune;
	}

	public void setCallerTune(String callerTune)
	{
		this.callerTune = callerTune;
	}

	public Integer getVesionCount()
	{
		return vesionCount;
	}

	public void setVesionCount(Integer vesionCount)
	{
		this.vesionCount = vesionCount;
	}

	@Override
	public String toString()
	{
		return "MobileCustomer [cId=" + cId + ", cName=" + cName + ", mobNo=" + mobNo + ", callerTune=" + callerTune
				+ ", vesionCount=" + vesionCount + "]";
	}

}
