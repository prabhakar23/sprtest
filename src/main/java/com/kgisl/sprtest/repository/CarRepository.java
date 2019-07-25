package com.kgisl.sprtest.repository;

import com.kgisl.sprtest.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CarRepository
 */
public interface CarRepository extends JpaRepository<Car,Long> {

    
} 