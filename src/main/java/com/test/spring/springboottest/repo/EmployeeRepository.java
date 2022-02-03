package com.test.spring.springboottest.repo;

import org.springframework.data.repository.CrudRepository;

import com.test.spring.springboottest.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
