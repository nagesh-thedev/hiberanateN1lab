package com.project5.hibernateN._Lab.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import com.project5.hibernateN._Lab.entity.Department;





@DataJpaTest
public class DepartmentRepositoryTest {
	
	
	private DepartmentRepository departmentRepo;

	public DepartmentRepositoryTest(DepartmentRepository departmentRepo) {
		super();
		this.departmentRepo = departmentRepo;
	}
	
	@Test
	public void testDepartmentsFetch() {
		
		List<Department> department = departmentRepo.findAll();
		assertEquals(3,department.size());
	}
	

}
