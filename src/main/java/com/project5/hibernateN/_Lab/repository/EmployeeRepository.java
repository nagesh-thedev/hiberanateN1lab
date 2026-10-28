package com.project5.hibernateN._Lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project5.hibernateN._Lab.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
