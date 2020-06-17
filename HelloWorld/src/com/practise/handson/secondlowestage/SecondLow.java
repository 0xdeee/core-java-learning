package com.practise.handson.secondlowestage;

public class SecondLow {
	public static Employee employeeWithSecondLowestAge(Employee []e)
	  {
	    int i,j;
	    Employee temp;
	    for(i=0;i<e.length;i++)
	    {
	      for(j=i+1;j<e.length;j++)
	      {
	        if(e[i].age>e[j].age)
	        {
	          temp = e[i];
	          e[i] = e[j];
	          e[j] = temp;
	        }
	      }
	    }
	    return e[1];
	  }
	  
	  public static void main(String []args)
	  {
	    Employee []e = new Employee[4];
	    e[0] = new Employee(1,"aaa",22);
	    e[1] = new Employee(2,"bbb",33);
	    e[2] = new Employee(3,"ccc",55);
	    e[3] = new Employee(4,"ddd",44);
	    Employee secondlowest = employeeWithSecondLowestAge(e);
	    System.out.println(secondlowest.id+" "+secondlowest.name+" "+secondlowest.age);
	  }

}
