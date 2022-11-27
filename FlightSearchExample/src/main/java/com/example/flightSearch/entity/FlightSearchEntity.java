package com.example.flightSearch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "FlightDetails")
public class FlightSearchEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getAirLineNames() {
		return airLineNames;
	}
	public void setAirLineNames(String airLineNames) {
		this.airLineNames = airLineNames;
	}
	private String flightName;
    private String airLineNames;
}
