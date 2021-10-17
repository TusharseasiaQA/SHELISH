package basicprogram;

public class Polymorphism {

	void show(int a,String b)
	{
		System.out.println("20");
	}
	void show()
	{
		System.out.println("30");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism ab=new Polymorphism();
		ab.show(2,"abc");
	}

}
