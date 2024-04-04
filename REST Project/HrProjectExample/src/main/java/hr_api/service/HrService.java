package hr_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import hr_api.entity.Department;
import hr_api.entity.Employee;
import hr_api.repository.DepartmentRepository;
import hr_api.repository.EmployeeReporsitory;

@Service
public class HrService {
	
	@Autowired
	private EmployeeReporsitory empRepositoryRef;
	
	@Autowired
	private DepartmentRepository deptRepositoryRef;
	
	public Collection<Employee> getAllEmployee(){
		
		return empRepositoryRef.findAll();
		
	}
	
	public Collection<Department> getDepartmentByDeptNo(Integer deptNo) {
	    Collection<Department> foundDepts = new ArrayList<>();
	    Optional<Department> optionalDept = deptRepositoryRef.findById(deptNo);

	    if (optionalDept.isPresent()) {
	        foundDepts.add(optionalDept.get());
	    }

	    return foundDepts;
	}

}
