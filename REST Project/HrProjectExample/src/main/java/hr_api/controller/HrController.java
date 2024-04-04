package hr_api.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hr_api.entity.Department;
import hr_api.entity.Employee;
import hr_api.service.HrService;

@RestController
public class HrController {

	@Autowired
	private HrService hrServiceRef;
	
	@GetMapping("/hr-api")
	public Collection<Employee> getAllEmployee(){
		return hrServiceRef.getAllEmployee();
	}
	
	
	@GetMapping("/hr-api/{deptno}")
	public Collection<Department>  getEmployeeByDeptNo(@PathVariable("deptno") Integer deptNo){
		return hrServiceRef.getDepartmentByDeptNo(deptNo);
	}
}
