package com.kgisl.sprtest.service;

import java.util.List;

import com.kgisl.sprtest.model.Car;
import com.kgisl.sprtest.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CarServiceImp
 */
@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarRepository carRepository;
    @Override
    public List<Car> getCars() {
        System.out.println(""+carRepository.findAll());
        return carRepository.findAll();
    }
}