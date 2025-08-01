package Array_DS;

import java.util.Scanner;

class ArrayOpertions_1{
	Scanner sc=new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	
	void createArray(){
		System.out.println("Enter no. of rows for Array1: ");
		int r1 =sc.nextInt();
		System.out.println("Enter no. of columns for Array1: ");
		int c1 =sc.nextInt();
		arr1=new int[r1][c1];
		System.out.println("Array1 Created Successfully!!!");
		System.out.println();
		System.out.println("Enter no. of rows for Array2: ");
		int r2 =sc.nextInt();
		System.out.println("Enter no. of columnss for Array2: ");
		int c2 =sc.nextInt();
		arr2=new int[r2][c2];
		System.err.println("Array2 Created Successfully!!!!");
		System.out.println();
	}
	
	
	void collectData() {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter Array1 element of Row.:"+(i+1)+"Column.: "+(j+1));
				arr1[i][j]=sc.nextInt();
			}
			System.out.println("--------------------------");
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter Array2 element of Row.:"+(i+1)+"Column.: "+(j+1));
				arr2[i][j]=sc.nextInt();
				arr1[i][j] += arr2[i][j];

			}
		}
		System.out.println("Data collected!!!!!!");
		
	}
	void displayData() {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				//Addition of two 2D-Arrays
				 System.out.println("The sum of two Arrays arr1 and arr2 is \n"+arr1[i][j]+" ");
			}
		}
	}
	
}
public class Array2D_Add {

	public static void main(String[] args) {
		ArrayOpertions_1 ao=new ArrayOpertions_1();
		ao.createArray();
		ao.collectData();
	ao.displayData();

	}

}
