package Array_DS;

import java.util.Scanner;

class ArrayOpertions_2{
	Scanner sc=new Scanner(System.in);
	int arr1[][];
	int arr2[][];
	int res[][];
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
		
		res=new int[r1][c2];
	}
	
	
	void collectData() {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter Array1 element of Row.:"+(i+1)+"Column.: "+(j+1));
				arr1[i][j]=sc.nextInt();
				System.out.println("--------------------------");
			}
			
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("Enter Array2 element of Row.:"+(i+1)+"Column.: "+(j+1));
				arr2[i][j]=sc.nextInt();
				System.out.println("--------------------------");
			}
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				res[i][j]=0;
				for(int k=0;k<arr1[0].length;k++) {
					
				res[i][j] += (arr1[i][k]*arr2[k][j]);
				}
			}
		}
		System.out.println("Data collected!!!!!!");
		
	}
	void displayData() {
		System.out.println("Result Matrix is: \n");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				//Addition of two 2D-Arrays
				 System.out.println(res[i][j]+"\t");
			}
		}
	}
	
}
public class Array2D_mul {

	public static void main(String[] args) {
		ArrayOpertions_2 ao=new ArrayOpertions_2();
		ao.createArray();
		ao.collectData();
	ao.displayData();

	}

}
