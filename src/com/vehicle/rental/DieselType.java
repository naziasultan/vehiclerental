package com.vehicle.rental;

public interface DieselType extends VehicleRental {
	
	double DIESEL_RATE=STANDARD_RATE-1;
	
	default double calculateDieselExpense(double distance, boolean ac)
	{

		double totalExpense;
		if(ac)
		{
			totalExpense=(DIESEL_RATE+AC_RATE)*(distance);
		}else
		{
			totalExpense=(DIESEL_RATE)*(distance);
		}		
		
		return totalExpense;
	
	}

}
