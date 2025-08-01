package Array_Ex_CJBook;
//Ques - 7
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int arr[][];
		Scanner sc=new Scanner(System.in);
		arr = new int[5][100];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no.: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no.: "+(j+1));
				arr[i][j]=sc.nextInt();
			}sc.close();
		}

	}

}
