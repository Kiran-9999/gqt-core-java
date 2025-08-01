package Array_Ex_CJBook;
// Ques - 6
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
			int arr[];
			arr =new int[100];
			for(int i=0;i<arr.length;i++) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Etner the marks of student "+(i+1)+" = ");
				arr[i] =sc.nextInt();
				sc.close();
				}
				System.out.println("");
				
	}

}
