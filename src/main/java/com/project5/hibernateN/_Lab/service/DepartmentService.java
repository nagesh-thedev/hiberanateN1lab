package com.project5.hibernateN._Lab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project5.hibernateN._Lab.entity.Department;
@Service
public interface DepartmentService {
	
	public List<Department> findAllwithEmployees();

	public List<Department> findAllwithEmployeesByJoinFetch();

	public List<Department> findAllwithEmployeesByEntityGraph();

}
