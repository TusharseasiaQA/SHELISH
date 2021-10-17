package basicprogram;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Arrayfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Array[]={10,30,40,20,50};
		
		String array=Arrays.toString(Array);
		int Array1[]={10,30,20,50};
		int Key=20;
		System.out.println("Integer Array as List:"+Arrays.asList(array));
		System.out.println("Integer Array comparison"+Arrays.equals(Array,Array1));
		
		System.out.println(Key+"found at index"+Arrays.binarySearch(Array,Key));
		
		System.out.println("Intger Array:"+Arrays.toString(Arrays.copyOf(Array,20)));
		
		System.out.println("Intger Array:"+Arrays.toString(Arrays.copyOfRange(Array,1,4))
		);
		
	}

}
