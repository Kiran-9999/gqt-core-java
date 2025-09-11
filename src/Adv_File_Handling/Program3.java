package Adv_File_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class Program3 {

	public static void main(String[] args) throws IOException {
		String path1="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\input.txt";
		String path2="C:\\Users\\kiran\\Documents\\GQT Core-Java\\IOprogs\\output1.txt";
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			
			fr=new FileReader(path1);
			br=new BufferedReader(fr);
			
			fw=new FileWriter(path2);
			bw=new BufferedWriter(fw);
			
			int x;
			while((x=br.read())!=-1){
				bw.write(x);
			}
			
		}
		finally {
			br.close();
			bw.close();
			fr.close();
			fw.close();
		}

	}

}
