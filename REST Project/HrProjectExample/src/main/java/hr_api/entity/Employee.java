package hr_api.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="empno")
	private int empId;
	
	@Column(name="ename")
	private String empName;
	
	@Column(name="job")
	private String empJob;
	
	@Column(name="sal")
	private int empSal;
	
	

	public Employee() {
		super();
	}

	
	public Employee(int empId, String empName, String empJob, int empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empJob = empJob;
		this.empSal = empSal;
		//this.department = department;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empJob=" + empJob + ", empSal=" + empSal
				+ "]";
	}
	
	
	
	
}
