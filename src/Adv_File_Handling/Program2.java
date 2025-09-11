package Adv_File_Handling;
import java.io.*;
public class Program2 {

	public static void main(String[] args)  throws IOException {
		String path1="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\file1.txt";
		String path2="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\file3.txt";
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(path1);
			fw=new FileWriter(path2);
			int x;
			while((x=fr.read())!=-1){
				fw.write(x);
			}
			
		}
		finally {
			fr.close();
			fw.close();
		}
	}

}
