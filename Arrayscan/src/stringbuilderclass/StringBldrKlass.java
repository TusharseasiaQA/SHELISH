package stringbuilderclass;

public class StringBldrKlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("BTI");
		sb.append(true);
		sb.append(101);
		sb.append(1.22);
		System.out.println(sb);
		sb.insert(0,"SST");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.delete(0,3);
		System.out.println(sb);
		String S1=new String(sb);
		System.out.println(S1.toUpperCase());
		StringBuilder sb1=new StringBuilder("123");
		StringBuilder sb2=new StringBuilder("123");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}		
	}

