package com.vehicle.rental;

public interface PetrolType extends VehicleRental{

	default double calculatePetrolExpense(double distance, boolean ac) 
	{
		double totalExpense;
		if(ac)
		{
			totalExpense=(STANDARD_RATE+AC_RATE)*(distance);
		}else
		{
			totalExpense=(STANDARD_RATE)*(distance);
		}		
		
		return totalExpense;
	
	}
}
