package demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferedreader {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rdr=new InputStreamReader(System.in);
		BufferedReader cin=new BufferedReader(rdr);
		int i;
		int N2=0;
		System.out.println("Ener N: 5");
      
		 try {
			N2=Integer.parseInt(cin.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      	
		int A[]=new int[N2];
		System.out.println("Enter "+N2 +"values :");
		for(i=0;i<A.length;i++)
			try {
				A[i]=Integer.parseInt(cin.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Output:");
		for(i=0;i<A.length;i++)
		{
		  System.out.println("A["+i+"]="+A[i]);
		}

	}

}
