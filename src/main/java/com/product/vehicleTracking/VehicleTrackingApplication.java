package com.product.vehicleTracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class VehicleTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleTrackingApplication.class, args);
	}
}
