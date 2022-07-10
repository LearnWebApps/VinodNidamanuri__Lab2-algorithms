package services;

public class payMoney {

	public void checkTran(int [] tranAmount, int [] targetAmount, int amount)
	{
		float total = 0;
		boolean targetAcheived = false;
		for(int travel=0; travel < tranAmount.length; travel++)
		{
			total = total + tranAmount[travel];
			if(total >= amount)
			{
				System.out.println("Target achieved after " + (travel + 1) + " transactions");
				targetAcheived = true;
				break;
			}
		}
		if (!targetAcheived)
			System.out.println("Given target is not acheived");
	}
}
