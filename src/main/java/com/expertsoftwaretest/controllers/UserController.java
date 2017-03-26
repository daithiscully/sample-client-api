package com.expertsoftwaretest.controllers;

import com.expertsoftwaretest.models.User;
import com.expertsoftwaretest.repositories.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    @ApiOperation(
            value = "Get all users",
            notes = "Returns a list of 5 users each request",
            response = User.class
    )
    public List<User> getListOfUsers() {

        return userRepository.getUsersList();
    }


    @PostMapping(value = "/users")
    public ResponseEntity<List<User>> addUser(@Valid @RequestBody User user) {

        return new ResponseEntity<>(userRepository.saveUser(user), HttpStatus.CREATED);
    }


    @PutMapping(value = "/users/{id}")
    public ResponseEntity<List<User>> updateUser(@Valid @RequestBody User user) {

        return new ResponseEntity<>(userRepository.saveUser(user), HttpStatus.OK);
    }

}
