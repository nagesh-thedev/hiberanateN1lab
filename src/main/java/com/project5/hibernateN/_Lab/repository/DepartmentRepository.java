package com.project5.hibernateN._Lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.project5.hibernateN._Lab.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Query("SELECT d FROM Department d JOIN FETCH d.employee")
	List<Department> findAllwithEmployeesByJoinFetch();
	
	@EntityGraph(attributePaths = {"employee"})
	List<Department> findAll();

}
