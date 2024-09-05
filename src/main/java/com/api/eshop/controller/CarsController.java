package com.api.eshop.controller;

import com.api.eshop.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cars")
public class CarsController {
    @Autowired
    CarsRepository repository;

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity getAllCar(){ return  new ResponseEntity(repository.findAll(), HttpStatus.OK);};

    @GetMapping("{id}")
    @CrossOrigin("*")
    public ResponseEntity getById(@PathVariable Integer id)
    {
        return  new ResponseEntity(repository.findById(id), HttpStatus.OK);


    };


};