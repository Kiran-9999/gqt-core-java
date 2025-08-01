package Array_Ex_CJBook;
// Ques - 8

import java.util.Scanner;

class Arr_Opers{
	int arr[][][];
	
	Scanner sc =new Scanner(System.in);
	void createArray() {
		arr =new int[3][5][100];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Inside School no.: "+(i+1));
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Inside Class no.: "+(j+1));
			for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the marks of student no." +(k+1)+" inside class no.:"+(j+1)+" is =");
				arr[i][j][k]= sc.nextInt();
			}
		}
	}
}
}


public class Example3 {

	public static void main(String[] args) {
Arr_Opers ao=new Arr_Opers();
ao.createArray();

	}

}
