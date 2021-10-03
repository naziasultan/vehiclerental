package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalMain {
	public static void main(String[] args) {
		List<CityDistance> cityToFrom= new ArrayList<>();
		cityToFrom.add(CityDistance.Pune_Mumbai);
		cityToFrom.add(CityDistance.Pune_Bangalore);
		VehicleRental car= new Car();
		
		System.out.println(car.calculateExpense(cityToFrom, false, 3, "diesel"));
		
		VehicleRental bus= new Bus();
		System.out.println(bus.calculateExpense(cityToFrom, false, 20, "diesel"));
				
	}

}
