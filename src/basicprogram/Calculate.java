
package basicprogram;
import java.util.Scanner;
public class calculate {
	public static void main(String[] args )	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=obj.nextInt();
	
		System.out.println("enter the second number");
		int b=obj.nextInt();
		
		System.out.println("the addition of two numbers"+(a+b));
		
		System.out.println("the sum of two number is"+(a-b));
		
		System.out.println("the multiplication of two number is"+(a*b));
		
		System.out.println("the division of two number is"+(a/b));
	}
	

}
