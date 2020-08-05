package com.reactive.reactiveworks.handler;

/**
 * 
 *@author Ramkumar
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.reactive.reactiveworks.dao.EmployeeRepository;
import com.reactive.reactiveworks.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class EmployeeHandler {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Mono<ServerResponse> findAllEmployees(ServerRequest request) {
		Flux<Employee> employees = employeeRepository.findAll();
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(employees, Employee.class);
	}
}
