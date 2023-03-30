package com.example.microservice_03.controller;


import com.example.microservice_03.entity.City;
import com.example.microservice_03.service1.ConsumeWebService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Autowired
    ConsumeWebService1 service1;
    //https://api.zippopotam.us/us/30004

    @GetMapping("/us/{zip}")
    public ResponseEntity<City> getCityById(@PathVariable("zip") int id) {

        ResponseEntity<City> response = new ResponseEntity<>(service1.getCity(id), HttpStatus.OK);
        return response;
    }
}
