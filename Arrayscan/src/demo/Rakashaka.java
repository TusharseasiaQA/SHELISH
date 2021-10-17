package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rakashaka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="";
		int count=1;
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader cin=new BufferedReader(rdr);
		
			System.out.println("enter a sting containing:");
			try {
				S1=cin.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String A[]=S1.split(",");
			for(int i=0;i<A.length;i++)
			{
				System.out.println(A[i]);
				
				for(String s : A)
				{
					System.out.println(s);
	
				}
			}
		
	}
}
	