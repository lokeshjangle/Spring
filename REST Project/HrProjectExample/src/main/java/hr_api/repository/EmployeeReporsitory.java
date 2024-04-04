package hr_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import hr_api.entity.Employee;

public interface EmployeeReporsitory extends JpaRepository<Employee, Integer> {
	//List<Employee> findByDept(Department department,Sort sort);
}
