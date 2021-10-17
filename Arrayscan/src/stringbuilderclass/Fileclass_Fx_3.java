package stringbuilderclass;

import java.io.File;

public class Fileclass_Fx_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ff=new File("c:\\windows");
		int fcount=0,dcount=0;
		File []listFiles=ff.listFiles();
		for(File s:listFiles)
		{
			if(s.isFile())
			{
			 System.out.println("File Name="+s);	
			 fcount++;
			}
			else
			{
				System.out.println("> Dir Name="+s);
				dcount++;
			}
			}
		System.out.println("Files="+fcount+"& Directories="+dcount);
	}

}
