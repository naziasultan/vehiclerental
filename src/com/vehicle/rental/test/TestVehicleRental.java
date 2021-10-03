package com.vehicle.rental.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.vehicle.rental.Car;
import com.vehicle.rental.CityDistance;

public class TestVehicleRental {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car();
    }

    @Test
   public void testcalculate() {
    	List<CityDistance> cityToFrom= new ArrayList<>();
		cityToFrom.add(CityDistance.Pune_Mumbai);
		cityToFrom.add(CityDistance.Pune_Bangalore);
		Assertions.assertEquals(16800.0, car.calculateExpense(cityToFrom, false, 3, "Diesel"));
		
		Assertions.assertNotEquals(16800.0, car.calculateExpense(cityToFrom, false, 3, "CNG"), "Fuel Type Not Available");
	    
    }

  
}