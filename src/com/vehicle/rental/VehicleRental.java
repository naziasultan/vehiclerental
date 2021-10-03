package com.vehicle.rental;

import java.util.List;

public interface VehicleRental extends ICityDistance{
	
	double STANDARD_RATE=15;
	double DIESEL_RATE=STANDARD_RATE-1;
	double AC_RATE=2;
	double BUS_RATE=0.02;

	
	double calculateExpense(List<CityDistance> cityToFrom, boolean ac, int numberOfPassengers, String fuelType);

		
	default double additonalPassengerEstimate(double estimate, int numberOfPassengers, int numberOfPassengersAllowed )
	{
		if(numberOfPassengers>numberOfPassengersAllowed)
		{
			estimate=estimate*(numberOfPassengers-numberOfPassengersAllowed);
		}
		return estimate;
		
	}
	
	
	

}
