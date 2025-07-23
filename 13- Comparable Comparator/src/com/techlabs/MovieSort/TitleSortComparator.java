package com.techlabs.MovieSort;

import java.util.Comparator;

public class TitleSortComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie a, Movie b) {
		int movieSort = a.title.compareTo(b.title);
		if (movieSort ==0) {
			return b.year - a.year;
		}else {
			return movieSort;
		}
	
	}

}
