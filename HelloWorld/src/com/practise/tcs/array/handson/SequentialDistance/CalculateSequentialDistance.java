package com.practise.tcs.array.handson.SequentialDistance;


public class CalculateSequentialDistance {
	  
	  public static void main(String args[])
	  {
	    Point []p = new Point[5];
	    p[0] = new Point(-3,-4);
	    p[1] = new Point(0,0);
	    p[2] = new Point(4,3);
	    p[3] = new Point(16,-2);
	    p[4] = new Point(12,1);
	    double seqdist = findSequentialDistance(p);
	    System.out.println(seqdist);
	  }
	  
	  public static double findSequentialDistance(Point []p)
	  {
	    double []dist = new double[((p.length)-1)];
	    double sequentialdistance=0;
	    int i,j,k=0;
	    for(i=0;i<(p.length-1);i++)
	    {
	      for(j=i+1;;)
	      {
	        double x =0;
	        x = (Math.pow((p[i].getx() - p[j].getx()), 2) + Math.pow((p[i].gety() - p[j].gety()), 2));
	        dist[k] = Math.sqrt(x);
	        k++;
	        break;
	      }
	    }
	    for(i=0;i<dist.length;i++)
	    {
	      sequentialdistance = sequentialdistance + dist[i];
	    }
	    return sequentialdistance;
	  }
	}

