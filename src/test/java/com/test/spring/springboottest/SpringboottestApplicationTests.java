package com.test.spring.springboottest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.spring.springboottest.entity.Employee;
import com.test.spring.springboottest.repo.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringboottestApplicationTests {
	@Autowired
	ApplicationContext context;
	@Test
	void contextLoads() {
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		
		Employee emp = new Employee();
		emp.setId(21);
		emp.setFname("Springboot");
		emp.setLname("ORM");
		
		emp.setLname("ORM_updated");
		repo.save(emp);
		
		
		
	}

}
