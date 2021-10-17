package basicprogram;

 class abcd{

	 public int x=5;
	 protected int y=8;
	 int z=33;
	 private int a=44;
	 public void meth(){
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(z);
		 System.out.println(a);
	 }		 
	 }
public 	 class Acessmodifier {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abcd am=new abcd();
		//am.meth();
		System.out.println(am.x);
		System.out.println(am.y);
		System.out.println(am.z);
		//System.out.println(am.a);
		
	}

}
