package com.greatelearning.driver;

import java.util.Scanner;
import com.greatelearning.model.SortDenomination;
import com.greatelearning.model.NotesCount;

public class CurrenyToBePaid {
	//Driver Class to get the denominations by Sorting and Calculation
	public static void main(String a[]) {
		int currency[];
		Scanner in = new Scanner(System.in);
		//Get the count of denominations values
		System.out.println("Enter the size of currency denominations");
		int denomSize = in.nextInt();
		System.out.println();
		//Get the values of denominations
		currency = new int[denomSize];
		System.out.println("Enter the currency denominations value");
		for (int i=0; i<denomSize;i++) {
			currency[i] = in.nextInt();
		}
		System.out.println();
		//Get the amount for which denomination need to given
		System.out.println("Enter the amount you want to pay");
		int amount = in.nextInt(); 
		System.out.println();
		//Call Function 
		SortDenomination sortDenom = new SortDenomination();
		currency = sortDenom.sortArray(currency,0,currency.length - 1);
		NotesCount noteCnt = new NotesCount();
		noteCnt.netesCountImplementation(currency, amount);
	}//End of Main
}//End of Class
