package demo;

import java.util.Scanner;

public class Ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of elements you want in array:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
			}
			
		} 
	
	
	
	
	
	
	
	
	

	}

}
