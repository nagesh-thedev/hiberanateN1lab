package com.project5.hibernateN._Lab.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project5.hibernateN._Lab.entity.Department;
import com.project5.hibernateN._Lab.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	
	
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}



	@GetMapping("/departments/v1")
	public ResponseEntity<List<Department>> findAllwithEmployees(){
		List<Department> departments = departmentService.findAllwithEmployees();
		return ResponseEntity.ok(departments);
	}
	
	
	@GetMapping("/departments/v2")
	public ResponseEntity<List<Department>> findAllwithEmployeesByJoinFetch(){
		List<Department> departments = departmentService.findAllwithEmployeesByJoinFetch();
		return ResponseEntity.ok(departments);
	}
	
	@GetMapping("/departments/v3")
	public ResponseEntity<List<Department>> findAllwithEmployeesByEntityGraph(){
		List<Department> departments = departmentService.findAllwithEmployeesByEntityGraph();
		return ResponseEntity.ok(departments);
	}

}
