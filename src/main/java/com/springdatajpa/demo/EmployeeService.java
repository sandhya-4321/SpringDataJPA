package com.springdatajpa.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class EmployeeService {

	EmployeeRepository er;
	
	public EmployeeService(EmployeeRepository er) {
		super();
		this.er = er;
	}

	public void AddEmployee(Employee emp) {
		er.save(emp);
		System.out.println("saved employee object");
	}
	
	public List<Employee> retriveEmp(){
		List<Employee> emps=er.findAll();
		return emps;
	}
	
	public Employee findByEId(int eid) {
		Employee emp=er.findById(eid).orElseThrow(()->new RuntimeException("employee not found"));
        return emp;	
	}
	
	public void deleteEmp(int eid) {
		Employee emp=findByEId(eid);
		er.delete(emp);
		System.out.println("delete successfully");
		
	}
	
	
	public void updateEmp(int eid) {
		Employee emp=findByEId(eid);
		emp.setEname("jaya");
		er.save(emp);
		System.out.println("updated successfully");
	}
	
	
	@Transactional
	public void transaction (int feid,int teid,double amt) {
		Employee semp=er.findById(feid).orElseThrow(()->new RuntimeException("employee not found"));
		Employee remp=er.findById(teid).orElseThrow(()->new RuntimeException("employee not found"));
		semp.setSal(semp.getSal()-amt);
		remp.setSal(remp.getSal()+amt);
		er.save(semp);
		er.save(remp);
		
	}
	
	public void getEmpName(String name) {
		List<Employee> emps=er.findByEname(name);
		System.out.println(emps);
	}
	
	public void getAge20(int age) {
		List<Employee> emps=er.findByAgeGreaterThanEqual(age);
		System.out.println(emps);
	}
	
	
}
