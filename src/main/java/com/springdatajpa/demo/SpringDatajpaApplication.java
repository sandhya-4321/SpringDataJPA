package com.springdatajpa.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatajpaApplication  implements CommandLineRunner{

	private EmployeeService es;
	
	public SpringDatajpaApplication(EmployeeService es) {
		super();
		this.es = es;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		
//		Employee emp=new Employee("kavya",21);	
//		es.AddEmployee(emp);
//		
//		
//		//read operation 
//		List<Employee>emps=es.retriveEmp();
//		if(!emps.isEmpty()) {
//		for(Employee e:emps) {
//			System.out.println(e);
//		}
//		}else {
//			System.out.println("Employees not found");
//		}
		
//		Employee emp=es.findByEId(1);
//		System.out.println(emp);
		
//		es.deleteEmp(10);
		
//		es.updateEmp(1);
		
		// es.transaction(2, 3, 20000);
//		es.getEmpName("kavya");
		
		es.getAge20(20);
		
	
	}
	

}
