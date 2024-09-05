package com.api.eshop.controller;


import com.api.eshop.domain.Menu;
import com.api.eshop.domain.TopBanner;
import com.api.eshop.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("menu")
public class MenuController {

@Autowired
private MenuRepository repository;

    @GetMapping
    public ResponseEntity getAllMenus()
    {
        return new ResponseEntity(repository.findAll() , HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity addNewProduct(@RequestBody Menu m)
    {
        repository.save(m);
        return new ResponseEntity( "save anjam shod", HttpStatus.OK);
    }

}
