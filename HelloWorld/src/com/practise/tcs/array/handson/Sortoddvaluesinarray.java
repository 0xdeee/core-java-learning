package com.practise.tcs.array.handson;

public class Sortoddvaluesinarray {
		  
		  static int []sortOddValue(int []unsortedarray)
		  {
		    int size,sizeofoddarray=0;
		    size = unsortedarray.length;
		    int i,j;
		    for(i=0;i<size;i++)
		    {
		      if(unsortedarray[i]%2!=0)
		      sizeofoddarray++;
		    }
		    int []oddarray = new int [sizeofoddarray];
		    for(i=0,j=0;i<size;i++)
		    {
		  
		      if(unsortedarray[i]%2!=0)
		      {
		      oddarray[j] = unsortedarray[i];
		      j++;
		      }
		    }
		    for(i=0;i<sizeofoddarray;i++)
		    {
		      for(j=i+1;j<sizeofoddarray;j++)
		      {
		        if(oddarray[i]>oddarray[j])
		        {
		          int temp = oddarray[i];
		          oddarray[i] = oddarray[j];
		          oddarray[j] = temp;
		        }
		      }
		    }
		    return oddarray;
		  }
		  
		  public static void main(String args[]){
		    int []unsortedarray = {111,77,88,44,32,11,13,25,44};
		    int []sortedarray = sortOddValue(unsortedarray);
		    for(int i:sortedarray)
		    {
		      System.out.print(i+" ");
		    }
		  }
		}

