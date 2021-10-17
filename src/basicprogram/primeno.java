package basicprogram;

public class primeno {
	public static void main(String[] args )	{
		int i=0;
		int j=0;
		String primeNumbers="";
		
	for( i=1;i<=100;i++)
	{
		int temp=0;
		for( j=i;j>=1;j--)
		{
			if(i%j==0)
			{
				temp=temp+1;
				
			}
		}
			if(temp==2)
			{
				primeNumbers=primeNumbers  +  i   +  " ";
			}

			
		}
		System.out.println("prime numbers from 1to100 are:");
		System.out.println(primeNumbers);
	
	}
	}

