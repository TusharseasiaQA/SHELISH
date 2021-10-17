package basicprogram;
 class single2
 {
	void A()
	{
		System.out.println("A");
	}
}
 public class Single extends single2
	{
		void B()
		{
			System.out.println("B");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Single ob= new Single();
		ob.B();
		ob.A();
				
		
	}
	
	

}