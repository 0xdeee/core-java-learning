package com.practise.xplore1.attempt;
import java.util.*;

public class Solution {

public static void main(String[] args) throws Exception {
		
		Car[] c=new Car[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<c.length;i++){
			int id=sc.nextInt();
			String name=sc.next();
			String fuel=sc.next();
			int milage=sc.nextInt();
			
			c[i]=new Car(id,name,fuel,milage);
		}
		Car[] d=sortarray(c,"diesel");
		
		for(int i=0;i<d.length;i++){
			System.out.println(d[i].getId()+" "+d[i].getName()+" "+d[i].getFuel()+" "+d[i].getMilage());
		}
		
		sc.close();

	}
	
	public static Car[] sortarray(Car[] c,String type){
		
		int j=0;
		for(int i=0;i<c.length;i++){
			if(c[i].getFuel().equals(type)) j++;
		}
		Car[] d=new Car[j];
		j=0;
		for(int i=0;i<c.length;i++){
			if(c[i].getFuel().equals(type)){
				//changed d[i] = c[i] to d[j] = c[i]...
				d[j]=c[i];
				// incrementing d arrays index
				j++;
			}
		}
		for(int i=0;i<d.length;i++){
			for(j=i+1;j<d.length;j++){
				if(d[j].getMilage()>d[i].getMilage()){
					Car temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				}
			}
		}
		return d;
	}
	}

