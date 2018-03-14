package com.product.vehicleTracking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.product.vehicleTracking.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {

}
