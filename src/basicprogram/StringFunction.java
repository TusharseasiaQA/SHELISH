package basicprogram;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="SeASiA";
		int value= name.length();
		System.out.println(value);
		
	    String lstring=name.toUpperCase();
	    System.out.println(lstring);
	    String nonTrimmedString="        seasia           ";
	    System.out.println(nonTrimmedString);
	    
	    String trimmedString=nonTrimmedString.trim();
	    System.out.println(trimmedString);
	    
	    System.out.println(name.substring(1));
	    System.out.println(name.substring(0,3));
	    System.out.println(name.replace('S','o'));
	    System.out.println(name.endsWith("O"));
	    System.out.println(name.startsWith("S"));
	    

	}

}
