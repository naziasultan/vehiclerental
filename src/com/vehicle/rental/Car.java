package com.vehicle.rental;

import java.util.List;

public class Car implements DieselType, PetrolType {

	int numberOfPassengersAllowed = 5;

	@Override
	public double calculateExpense(List<CityDistance> cityToFrom, boolean ac, int numberOfPassengers, String fuelType) {
		double totalExpense = 0;
		double totalDistance = totalDistance(cityToFrom);
		if (fuelType.equalsIgnoreCase("Diesel")) {
			
			totalExpense = calculateDieselExpense(totalDistance, ac);

		} else if (fuelType.equalsIgnoreCase("Petrol")){
			totalExpense = calculatePetrolExpense(totalDistance, ac);

		}		
		totalExpense = additonalPassengerEstimate(totalExpense, numberOfPassengers, numberOfPassengersAllowed);

		return totalExpense;
	}

}
