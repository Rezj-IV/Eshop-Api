package com.api.eshop.controller;

import com.api.eshop.repository.SellersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sellers")
public class SellersController {

    @Autowired
    SellersRepository repository ;

    // get all sellers in json

    @GetMapping
    public ResponseEntity getAllSellers()
    {
        return new ResponseEntity(repository.findAll(), HttpStatus.OK);
    }

}
