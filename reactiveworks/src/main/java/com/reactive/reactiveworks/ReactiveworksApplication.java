package com.reactive.reactiveworks;

/**
 * 
 *@author Ramkumar
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.reactive.reactiveworks"})
public class ReactiveworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveworksApplication.class, args);
	}

}

