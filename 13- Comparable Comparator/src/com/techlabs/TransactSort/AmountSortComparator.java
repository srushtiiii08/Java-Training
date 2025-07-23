package com.techlabs.TransactSort;

import java.util.Comparator;

public class AmountSortComparator implements Comparator<Transaction>{

	@Override
	public int compare(Transaction a, Transaction b) {
		if (a.amount > b.amount) {
			return -1;  //a before b
		} else if (a.amount < b.amount) {
			return 1;	//a after b
		}else {    //if amt is equal
			if (a.id > b.id)
				return -1;
			else if (a.id< b.id)
				return 1; 
			else
				return 0;  //id equal
		}
	}

}
