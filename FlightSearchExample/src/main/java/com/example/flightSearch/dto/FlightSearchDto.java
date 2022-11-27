package com.example.flightSearch.dto;

import org.springframework.stereotype.Component;

@Component
public class FlightSearchDto {
	
	private Integer id;
	private String name;
	private String airLines;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}

}
