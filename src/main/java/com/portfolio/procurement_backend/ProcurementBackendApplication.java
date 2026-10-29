package com.portfolio.procurement_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProcurementBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcurementBackendApplication.class, args);
	}

}
