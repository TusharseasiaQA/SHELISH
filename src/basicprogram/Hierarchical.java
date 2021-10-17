package basicprogram;

		class A1
		{
			void show1()
			{
				System.out.println("A");
		}
		}
			class B1 extends A1
			{
			
				void show2()
				
				{
					System.out.println("B");
					
				}
				
			}
			class C extends A1
			{
				void show3()
				{
					System.out.println("C");	
				}
			}
	
	public class Hierarchical {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			C ob=new C();
		
			ob.show3();
			ob.show1();
		
				

			
}
}
