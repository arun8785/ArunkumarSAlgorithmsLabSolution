package com.greatelearning.model;

import java.util.Scanner;

public class CheckTransaction {
	
	int temp;
	int trg;
	private int arr[];
	public int index;
	boolean active;
	
	public void addTransactions(int size) {
		Scanner in = new Scanner(System.in);
		arr = new int[size];
		System.out.println("Transaction Details:");
		for(int i=0;i<size;i++) {
			arr[i] = in.nextInt();;	
		}
	}	
	
	public int tragetAchived(int traget) {
		trg = 0;
		temp = 0;
		trg = traget;
		index = 0;
		for(int i=0;i<arr.length - 1;i++) {
			this.temp = this.temp + arr[i];
			if (this.temp > trg ) {
				index = i + 1;
		    	active = true;
		    }	
			if (active) {
				break;
			}
		}
		return index;
	}
}
		
