package com.product.vehicleTracking.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.product.vehicleTracking.document.Users;
import com.product.vehicleTracking.repository.UserRepository;

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@EnableMongoRepositories(basePackages = "com.product.vehicleTracking.repository")
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepo) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                userRepo.save(new Users(1, "chandra", "mobileNo12345", "aadharNo123", "chandra@chandhuthedev.com",
                        "licenceNo"));

            }

        };

    }

}
