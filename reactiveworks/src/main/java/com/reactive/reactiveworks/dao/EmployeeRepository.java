package com.reactive.reactiveworks.dao;

/**
 * 
 *@author Ramkumar
 *
 */
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.reactive.reactiveworks.model.Employee;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String>{

}
