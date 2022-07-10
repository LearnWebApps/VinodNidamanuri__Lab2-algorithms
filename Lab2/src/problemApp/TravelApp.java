package problemApp;

import services.TravellerPayment;
import java.util.*;
//import java.util.Scanner;
//import java.util.Arrays;
import java.util.Collections;

public class TravelApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  noOfDenominations = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations ");
		noOfDenominations = scan.nextInt();
//		int denominations[] = new int[noOfDenominations];
		Integer denominations[] = new Integer[noOfDenominations];
		TravellerPayment tpay = new TravellerPayment();
		tpay.getDenominations(denominations);

		Arrays.sort(denominations, Collections.reverseOrder());

		System.out.println("Enter the amount you want to pay ");

		int amountToPay = 0;
		amountToPay = scan.nextInt();
	
		tpay.denominationsToPay(denominations, amountToPay);
		scan.close();

	}

}
