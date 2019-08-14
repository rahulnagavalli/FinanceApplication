package com.marlabs.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
