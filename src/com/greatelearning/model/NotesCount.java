package com.greatelearning.model;

public class NotesCount {
	//This Class is used to validate the denominations for the amount
	public void netesCountImplementation(int notes[], int amount) { 
		int[] noteCounter = new int [notes.length];
		for(int i=0;i<notes.length;i++) {
			if(amount >= notes[i]) {
				noteCounter[i]=amount/notes[i];
				amount = amount - noteCounter[i] * notes[i];
			}
		}
		
		if(amount>0) {
			System.out.println("Exact amount can not be done by denominations");
		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<notes.length;i++) {
				System.out.println(notes[i]+":"+noteCounter[i]);
			}
		}
	}//End of Method
}//End of Class
