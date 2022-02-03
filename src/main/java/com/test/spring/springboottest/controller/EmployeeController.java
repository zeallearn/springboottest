package com.test.spring.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.springboottest.entity.Employee;
import com.test.spring.springboottest.repo.EmployeeRepository;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping
	public  Employee create(@RequestBody Employee employee) {
		return repository.save(employee);
	}
	
	@GetMapping
	public  Iterable<Employee> getInfo() {
		return repository.findAll();
	}
	
	

}
