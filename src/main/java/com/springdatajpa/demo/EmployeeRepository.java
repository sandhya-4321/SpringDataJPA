package com.springdatajpa.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	List<Employee> findByEname(String name); //select 8 from employee where ename=name;
	
	List<Employee> findByAgeGreaterThanEqual(int age); 
	
	
}
