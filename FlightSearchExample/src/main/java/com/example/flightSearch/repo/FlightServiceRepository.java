package com.example.flightSearch.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.flightSearch.entity.FlightSearchEntity;

@Repository
public interface FlightServiceRepository extends CrudRepository<FlightSearchEntity, Integer>{

}
