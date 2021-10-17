package stringbuilderclass;

import java.io.File;
import java.io.IOException;

public class Fileconstructor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File F1=new File("PDIR/CDIR");
		File F2=new File("PDIR/CDIR","data/file.txt");
		File F3=new File(F1,"data/file2.txt");
		try {
			System.out.println("F1:pathname="+F1.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("F2:pathname="+F2.getCanonicalPath());
		System.out.println("F3:pathname="+F3.getCanonicalPath());
		

	}

}
