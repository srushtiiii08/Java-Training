package com.techlabs.MovieSort;

import java.util.Comparator;

public class YearComparatorDesc implements Comparator<Movie>{

	@Override
	public int compare(Movie a, Movie b) {
		return b.year - a.year;
	}

}
