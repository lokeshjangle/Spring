package hr_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hr_api.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	//Department findByDeptId(Long deptno);
}
