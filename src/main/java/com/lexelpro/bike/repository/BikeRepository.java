package com.lexelpro.bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lexelpro.bike.model.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long>{

}
