package com.example.flightSearch.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightSearch.entity.FlightSearchEntity;
import com.example.flightSearch.repo.FlightServiceRepository;

@Service
public class FlightSearchService {
	@Autowired
	public FlightServiceRepository repo;
	
	public Optional<FlightSearchEntity> getFlightDetails(Integer id){
		return repo.findById(id);
	}
	
	public FlightSearchEntity addFlight(FlightSearchEntity entity) {
		return repo.save(entity);
	}

}
