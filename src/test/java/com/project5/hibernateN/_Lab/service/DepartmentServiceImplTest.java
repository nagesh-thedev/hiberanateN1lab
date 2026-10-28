package com.project5.hibernateN._Lab.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.project5.hibernateN._Lab.entity.Department;
import com.project5.hibernateN._Lab.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceImplTest {
	
	@Mock
	private DepartmentRepository departmentRepository;

	@InjectMocks
	private DepartmentServiceImpl departmentServiceImpl;
	
	
	
	public List<Department> getDepartments(){
		List<Department> departments = new ArrayList<>();

		Department engineering = new Department();
		engineering.setId(1L);
		engineering.setName("Engineering");

		Department hr = new Department();
		hr.setId(2L);
		hr.setName("Human Resources");

		Department finance = new Department();
		finance.setId(3L);
		finance.setName("Finance");

		departments.add(engineering);
		departments.add(hr);
		departments.add(finance);
		return departments;
	}
	
	@Test
	public void getDepartments_returnsDepartments_whenRepositoryHasData() {
		
		List<Department> departments = getDepartments();
		when(departmentRepository.findAll()).thenReturn(departments);
		List<Department> fetchedDepartments = departmentServiceImpl.findAllwithEmployees();
		assertEquals(departments.size(),fetchedDepartments.size());
	}
	
	@Test
	public void getDepartments_returnsDepartments_whenRepositoryHasNullData() {
		
		List<Department> departments = new ArrayList<Department>();
		when(departmentRepository.findAll()).thenReturn(departments);
		List<Department> fetchedDepartments = departmentServiceImpl.findAllwithEmployees();
		assertTrue(fetchedDepartments.isEmpty());
	}
	
	

}
