package basicprogram;

abstract class Abstraction1 {
	abstract void show();
}
class Abc extends Abstraction1
{
	void show()
	{
		System.out.println("A");
	}
}
	public class Abstraction extends Abstraction1
	{
		void show()
		{
			System.out.println("B");
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Abc ob1=new Abc();
		ob1.show();
		
		Abstraction ob2=new Abstraction();
		ob2.show();
		
	

	}

}
