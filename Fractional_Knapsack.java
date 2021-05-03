package Lab;

import java.util.*;

public class Fractional_Knapsack {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the capacity  : ");
	int w=sc.nextInt();
	System.out.println("Enter no. of items: ");
	int n=sc.nextInt();
	
	Random rand= new Random();
	int val[]=new int[n];
	for(int i=0;i<n;i++)
    {
    	val[i]=rand.nextInt(1000);
    }
	
	int wt[]= new int[n];
	for(int i=0;i<n;i++)
    {
    	wt[i]=rand.nextInt(100);
    }
	
	int mat[][]=new int[n+1][w+1];
	for(int r=0;r<w+1;r++)
	{
		mat[0][r]=0;
	}
	for(int c=0;c<n+1;c++)
	{
		mat[c][0]=0;
	}
	
	for(int item=1;item<=n;item++)
	{
		for(int capacity=1;capacity<=w;capacity++)
		{
			int maxValWithoutCurr=mat[item-1][capacity];
			int maxValWithCurr=0;
			
			int weightOfCurr=wt[item-1];
			if(capacity>=weightOfCurr)
			{
				maxValWithCurr=val[item-1];
				
				int remainingCapacity=capacity-weightOfCurr;
				maxValWithCurr+=mat[item-1][remainingCapacity];
				
			}
			
			if(maxValWithoutCurr>maxValWithCurr)
			{
				mat[item][capacity]=maxValWithoutCurr;
								
			}
			else
			{
				mat[item][capacity]=maxValWithCurr;
				
			}
							
		}
	}
	
	System.out.println("Total profit:" +mat[n][w]);
	
	System.out.println("Items selected:");
	
	while(n>0)
	{
		if(mat[n][w]!=mat[n-1][w])
		{
			System.out.println("Item "+ n +" 1");
			w=w-wt[n-1];
			
		}
		else
		{
			System.out.println("Item "+ n +" 0");
		}
	
		n--;
	}
}
}