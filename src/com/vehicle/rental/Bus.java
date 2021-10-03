package com.vehicle.rental;

import java.util.List;

public class Bus implements DieselType {
	int numberOfPassengersAllowed = 20;

	@Override
	public double calculateExpense(List<CityDistance> cityToFrom, boolean ac, int numberOfPassengers, String fuelType) {
		double totalDistance = totalDistance(cityToFrom);
		double totalExpense = calculateDieselExpense(totalDistance, ac);
		totalExpense-=totalExpense*BUS_RATE;
		totalExpense = additonalPassengerEstimate(totalExpense, numberOfPassengers, numberOfPassengersAllowed);

		return totalExpense;
	}

}
