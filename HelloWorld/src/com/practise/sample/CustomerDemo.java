package com.practise.sample;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  		Customer c1 = new Customer(1,"JDH","may 1",20000,"vijay",12);
  		Customer c2  = new Customer(2,"KFf","june 1",234343,"rina",23);
  		Customer c3= new Customer(3,"src","july 2",232432,"tina",22);
  		Customer c4 = new Customer(4,"JDH","november 1",34324,"jay",21);
  		Customer customers[]= {c1,c2,c3,c4};
        Customer cust[]= getEvenPosition (customers);

        for(int i=0;i<cust.length;i++)
        {
        	System.out.println(cust[i].getId()+" "+cust[i].getName()+" "+cust[i].getDob()+" "+cust[i].getSalary()+" "+cust[i].getEmail()+" "+cust[i].getAge());
  		
        }	
        
        Customer []cust1 = SearchCustomerByName(customers,"JDH");
        	if(cust1==null)
        	{
        		System.out.println("null");
        	}
        	else {
        		for(Customer c:cust1) {
        	System.out.println(c.getId()+" "+c.getName()+" "+c.getDob()+" "+c.getSalary()+" "+c.getEmail()+" "+c.getAge());
        		}
        		}
	}
	
public static Customer[] getEvenPosition (Customer [] customers)
{
	int i,j=0,c=0;
	for(i=0;i<customers.length;i++)
	{
		if(i%2==0)
			c++;
	}
	Customer []res = new  Customer[c];
	for(i=0;i<customers.length;i++)
	{
		if(i%2==0)
			{res[j] = customers[i];
		j++;}
	}
	return res;
}
public static Customer []SearchCustomerByName(Customer [] customers , String name)
{
	Customer []temp = new Customer[2];
	int j=0;
	for(int i=0;i<customers.length;i++)
	{
              if(name.equals(customers[i].getName()))
              {
            	  temp[j] = customers[i];
            	  j++;
              }
		}
return temp;	
}
}
