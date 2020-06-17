package com.practise.array.non.primitive.search;

public class Main {

	public static void main(String[] args) {
		
		Customer[] cust = new Customer[5];
		cust[0] = new Customer(1,"aaa","madurai",999998989,12345,"Savings");
		cust[1] = new Customer(1,"bbb","madurai",999998989,23456,"Savings");
		cust[2] = new Customer(1,"ccc","madurai",999998989,34567,"Savings");
		cust[3] = new Customer(1,"ddd","madurai",999998989,45678,"Savings");
		cust[4] = new Customer(1,"aaa","madurai",999998989,56789,"Savings");
		System.out.println("Does aaa Exist: "+CustomerUtil.checkCustomerExistance(cust, "aaa"));
		System.out.println("number of accounts aaa have: "+CustomerUtil.checkNumberofAccounts(cust, "aaa"));
		System.out.println("Account numbers of aaa :");
		int ac[]=CustomerUtil.printAccountNumber(cust, "aaa");
		for(int i=0;i<ac.length;i++)
		{
			if(i%2==0)
			System.out.println(ac[i]);
		}
				
	}

}
