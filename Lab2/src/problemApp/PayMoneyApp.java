package problemApp;

import java.util.Scanner;
import services.payMoney;

import services.payMoney;

public class PayMoneyApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numOfTrans = 0;
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the size of transaction array: ");
		numOfTrans = scan.nextInt();
		
		int tranAmount[] = new int[numOfTrans];
		
		System.out.println("Enter the values of array: ");
		
		for(int index=0; index < tranAmount.length; index++)
			tranAmount[index] = scan.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int numOfTargets = scan.nextInt();
		
		if (numOfTargets > 0) 
		{
			int targetAmount[] = new int[numOfTargets];
			payMoney pm = new payMoney();
					
			for(int index=0; index < targetAmount.length; index++)
			{
				System.out.println("Enter the value of target: ");
				int amount = scan.nextInt();
				pm.checkTran(tranAmount, targetAmount, amount);
			}		
		}
		scan.close();
	}
}
