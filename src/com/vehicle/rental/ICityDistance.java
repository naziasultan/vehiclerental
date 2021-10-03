package com.vehicle.rental;

import java.util.List;

public interface ICityDistance {

	default double distance(CityDistance cityToFrom)
	{
		double distance = 0;
		
		switch(cityToFrom)
		{
		case Pune_Mumbai:
			distance=200;
	        break;
		case Pune_Bangalore:
			distance=1000;
	        break;
		case Mumbai_Delhi:
			distance=2050;
	        break;
		case Mumbai_Chennai:
			distance=1234.5;
	        break;
		}
		return distance;		

	}
	
	
	default double totalDistance(List<CityDistance> numberOfDistinations)
	{
		double totaldistance=0;
		for (int i = 0; i < numberOfDistinations.size(); i++) {
			totaldistance+=distance(numberOfDistinations.get(i));
		}
	return totaldistance;
		
	}
}
