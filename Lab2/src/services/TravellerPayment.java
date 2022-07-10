package services;

import java.util.Scanner;

public class TravellerPayment 
{
//	public void getDenominations(int denominations[]) {
	public void getDenominations(Integer denominations[]) {	

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the currency denominations value ");
		for(int index=0; index < denominations.length; index++) {
			denominations[index] = sc.nextInt();
		}
//		sc.close();
	}


//	public void denominationsToPay(int denominations[], int amountToPay) {	
	public void denominationsToPay(Integer denominations[], int amountToPay) {	
		int denominationsToPay[] = new int[denominations.length];

		int amount = amountToPay;

		for(int index =0; index < denominations.length; index++) {
			denominationsToPay[index] = amount / denominations[index];
			amount -= (denominations[index] * denominationsToPay[index]);
		}
		if(amount != 0) {
			System.out.println("Sorry can’t make exact payment");
			return;
//			denominationsToPay[denominations.length-1]++;
		}

		System.out.println("Your payment approach in order to give min no of notes will be ");
		for(int index=0; index < denominations.length; index++) {
			if(denominationsToPay[index] != 0) {
				System.out.println(denominations[index] + " : " + denominationsToPay[index]);
			}
		}

	}
}
