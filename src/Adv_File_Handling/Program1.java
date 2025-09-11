package Adv_File_Handling;
import java.io.*;

public class Program1 {

	public static void main(String[] args) throws IOException{
		String path1="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\file1.txt";
		String path2="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\file2.txt";
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream(path1);
			int x;
			fos=new FileOutputStream(path2);
			while((x=fis.read())!=-1) {
				fos.write(x);
			}
		}
		finally {
			fis.close();
			fos.close();
			
		}
		
	}

}
