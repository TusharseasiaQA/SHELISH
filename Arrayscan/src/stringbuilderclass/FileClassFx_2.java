package stringbuilderclass;

import java.io.File;

public class FileClassFx_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File delFile=new File("c:\\chk4.java");
		boolean b=delFile.delete();
		if(b==true)
			System.out.println("File deleted");
		else
			System.out.println("File Not Found");

	}

}
