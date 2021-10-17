package basicprogram;

class Employee
{
	private int empid;
	public void setempid(int empid1)
	{
		empid=empid1;
	}
	public int getempid()
	{
		return empid;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.setempid(500);
	System.out.println(emp.getempid());
	}
	

}
