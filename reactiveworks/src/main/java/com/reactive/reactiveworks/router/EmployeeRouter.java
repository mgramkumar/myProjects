package com.reactive.reactiveworks.router;

/**
 * 
 *@author Ramkumar
 *
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.reactive.reactiveworks.handler.EmployeeHandler;

@Configuration
public class EmployeeRouter {

	@Bean
	public RouterFunction<ServerResponse> employeeRote(EmployeeHandler handler) {
		return RouterFunctions.route(RequestPredicates.GET("/employees").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::findAllEmployees);
	}
}
