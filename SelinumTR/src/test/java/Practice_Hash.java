import java.util.HashMap;
import java.util.Map;

public class Practice_Hash {

		// TODO Auto-generated method stub
		
			public  void mapInterfaceHashMap() {
		
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "shelish");
		hm.put(2, "luvkush");
		hm.put(3, "rahul");
		System.out.println("value for 1 is  "+hm.get(1));
		for(Map.Entry<Integer, String>e :hm.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
			
			
		}
	}

			public static void main(String[] args) {


				Practice_Hash hmp=new Practice_Hash();
				hmp.mapInterfaceHashMap();
				
}

}