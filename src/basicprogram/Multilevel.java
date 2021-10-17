package basicprogram;
 class show1
 {
	void A()
	{
		System.out.println("A");
	}
}
 class show2 extends show1
 {
	void B()
	{
		System.out.println("B");
	}
}
 public class Multilevel extends show2 
	{
		void C()
		{
			System.out.println("C");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multilevel ob= new Multilevel();
		ob.B();
		ob.A();
		ob.C();	
		
	}
	
	

}