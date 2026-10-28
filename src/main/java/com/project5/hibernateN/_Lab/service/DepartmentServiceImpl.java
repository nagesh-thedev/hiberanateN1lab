package com.project5.hibernateN._Lab.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project5.hibernateN._Lab.entity.Department;
import com.project5.hibernateN._Lab.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentRepository departmentrepository;
	
	public DepartmentServiceImpl(DepartmentRepository departmentrepository) {
		super();
		this.departmentrepository = departmentrepository;
	}


	@Override
	public List<Department> findAllwithEmployees() {
		return departmentrepository.findAll();
	}


	@Override
	public List<Department> findAllwithEmployeesByJoinFetch() {
		return departmentrepository.findAllwithEmployeesByJoinFetch();
	}


	@Override
	public List<Department> findAllwithEmployeesByEntityGraph() {
		return departmentrepository.findAll();
	}



}
