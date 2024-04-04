package hr_api.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="dept")
public class Department{
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="deptno")
	private int deptNo;
	
//	@Column(name="dname")
//	private String deptName;
//	
//	@Column(name="loc")
//	private String location;
//	
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name="deptno")
	private List<Employee> employee;
	
	
	public Department() {
	}
	public Department(int deptNo, String deptName, String location) {
		super();
		this.deptNo = deptNo;
//		this.deptName = deptName;
//		this.location = location;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
//	@Override
//	public String toString() {
//		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", location=" + location + ", employee="
//				+ employee + "]";
//	}

}
