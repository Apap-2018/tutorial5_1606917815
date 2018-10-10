package com.apap.tutorial5.service;

import com.apap.tutorial5.model.FlightModel;

/***FlightService*/
public interface FlightService {
	FlightModel getFlightDetailByFlightNumber(String flightNumber);
//	FlightModel getFlightDetailById(long id);
	void addFlight(FlightModel flight);
//	void deleteFlight(String flightNumber);
	void updateFlight(String flightNumber, FlightModel flight);
	void deleteFlightById(long id);
}
