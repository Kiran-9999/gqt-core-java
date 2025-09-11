package Adv_File_Handling;
import java.io.*;
public class Program4 {
public static void main(String[] args) throws IOException{
	String path1="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\input.txt";
	String path2="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\output2.txt";
	
	FileInputStream fr=null;
	FileOutputStream fw=null;
	BufferedInputStream bis=null;
	BufferedOutputStream bos=null;
	try {
		fr=new FileInputStream(path1);
		bis=new BufferedInputStream(fr);
		
		fw= new FileOutputStream(path2);
		bos=new BufferedOutputStream(fw);
		int x;
		while((x=bis.read())!=-1) {
			fw.write(x);
		}
	}
	finally {
		
	}
	
}
}
