package com.greatelearning.driver;

import java.util.Scanner;

import com.greatelearning.model.CheckTransaction;

public class PayMoneyTragetCheck {
	//Drive class to get the size of array and call the model class for validations
	public static void main(String a[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = in.nextInt();
		CheckTransaction trgCheck = new CheckTransaction();
		trgCheck.addTransactions(size);
		System.out.println("Enter the values of array");
		int tragetCount = in.nextInt();
		for (int j=0;j<tragetCount;j++) {
			System.out.println("Enter the total no of targets that needs to be achieved");
			int target = in.nextInt();
			trgCheck.tragetAchived(target);
			if (trgCheck.index != 0) {
				System.out.println("Target achieved after "+ trgCheck.index + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
		}//End of Main	
	}//End of Class
}
