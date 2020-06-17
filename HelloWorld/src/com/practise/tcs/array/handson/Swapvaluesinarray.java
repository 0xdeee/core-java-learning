package com.practise.tcs.array.handson;

public class Swapvaluesinarray {
		  
		  public static int []swapValues(int []array)
		  {
		    int size = array.length;
		    if(size%2!=0)
		    {
		      size--;
		    }
		      int i,j;
		      for(i=0;i<size;i=i+2)
		      {
		        if(i==size)
		        {
		          break;
		        }
		        for(j=i+1;;)
		        {
		          int temp = array[i];
		          array[i] = array[j];
		          array[j] = temp;
		          break;
		        }
		      }
		    return array;
		  }
		  
		  public static void main(String args[])
		  {
		    int []array = {111,77,88,44,32,11,13,25,44};
		    int []swappedarray = swapValues(array);
		    for(int i:swappedarray)
		    {
		      System.out.print(i+" ");
		    }
		  }
		}
