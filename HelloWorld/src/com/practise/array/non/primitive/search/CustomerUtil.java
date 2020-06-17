package com.practise.array.non.primitive.search;

public class CustomerUtil {
	
	public static boolean checkCustomerExistance(Customer[] c,String name)
	{
		boolean stat = false;
		for(Customer cust:c)
		{
			if(cust.getCustomername().equals(name))
				{
				stat = true;
				break;
				}
			
		}
		return stat;
	}
	
	public static int checkNumberofAccounts(Customer[] c,String name)
	{
		int count=0;
		for(Customer cust:c)
		{
			if(cust.getCustomername().equals(name))
				count++;
		}
		return count;
	}
	
	public static int[] printAccountNumber(Customer[] c,String name)
	{
		int[] acc = new int[5];
		int k=0;
		for(Customer cust:c)
		{
			if(cust.getCustomername().equals(name))
		
				{acc[k]=cust.getAccountnumber();
				k++;}
		}
		return acc;
	}

}
