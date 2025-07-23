package com.techlabs.Flight_Fare_Sort;

import java.util.Comparator;

public class FareSortDesc implements Comparator<Flight>{

	@Override
	public int compare(Flight a, Flight b) {
		return Double.compare(b.fare, a.fare);
	}

}
