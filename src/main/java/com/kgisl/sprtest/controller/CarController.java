package com.kgisl.sprtest.controller;

import java.util.List;

import com.kgisl.sprtest.model.Car;
import com.kgisl.sprtest.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CarController
 */
@RestController
@RequestMapping("/cars")
public class CarController {
@Autowired
CarService carService;
@GetMapping("/")
public List<Car> getallcars(){
    return carService.getCars();
}
    
}