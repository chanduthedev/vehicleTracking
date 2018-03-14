package com.product.vehicleTracking.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.vehicleTracking.repository.UserRepository;

@RestController
public class UsersResource<Users> {

    @Autowired
    UserRepository userRepo;

    @GetMapping("/api/users")
    public List<com.product.vehicleTracking.document.Users> getAll() {
        return userRepo.findAll();
    }

}
