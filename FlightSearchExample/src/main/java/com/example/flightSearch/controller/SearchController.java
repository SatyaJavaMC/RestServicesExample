package com.example.flightSearch.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightSearch.dto.FlightSearchDto;
import com.example.flightSearch.entity.FlightSearchEntity;
import com.example.flightSearch.service.FlightSearchService;

@RestController
public class SearchController {
	
	@Autowired
	public FlightSearchService service;
	

	@GetMapping("/getFlights")
	public Optional<FlightSearchEntity> getFlights(@RequestParam Integer id) {
		return service.getFlightDetails(id);		
	}
	
	@PostMapping("/addFlightDetails")
	public FlightSearchEntity addFlightDetails(@RequestBody FlightSearchEntity entity) {
		return service.addFlight(entity);
	}
	
}
