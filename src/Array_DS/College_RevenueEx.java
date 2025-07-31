package Array_DS;

import java.util.Scanner;

class CollegeOperations {
	String arr[][][];
	long medical_fee=2500000;
	long enginer_fee=250000;
	long degree_fee=80000;
	
	long total_revenue=0;
	
Scanner sc=new Scanner(System.in);



	void createArray() {
		System.out.println("Enter the No of branches in College:");
		int brnh = sc.nextInt();
		arr = new String[brnh][][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the count of classes inside Branch no: " + (i + 1));
			arr[i] = new String[sc.nextInt()][];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside Branch no: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the count of students inside class no.: " + (j + 1));
				arr[i][j] = new String[sc.nextInt()];
			}
		}
		System.out.println("Array created!!!!!!");
		System.out.println("--------------------");
	}

	
	
	
	void collectNamesData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside Branch no." + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Inside class no. " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter the name of Student no." + (k + 1) + " =");
					arr[i][j][k] = sc.next();
				}
			}
		}
	}

	
	
	
	  void calculateRevenueData() { 
		  for(int i=0;i<arr.length;i++) {
			  long feePerStudent;
			  if(i==0) {
				  feePerStudent=medical_fee;
			  }else if(i==1){
				  feePerStudent=enginer_fee;
			  }else{
				  feePerStudent=degree_fee;
			  }
			  
			 for(int j=0;j<arr[i].length;j++) { 
				for(int k=0;k<arr[i][j].length;k++) {
					total_revenue += feePerStudent;
				}
					 
				 }
			 }
		  System.out.println("Caliculated revenue Successfully!!!");
		  System.out.println("-------------------------------------");
		  System.out.println();
		  System.out.println();
	  } 
	  
	  
	  
	  
	  void displayData() {
		  System.out.println("Total Revenue collected by all Branches is: "+total_revenue);
		  System.out.println();
		  System.out.println();
		  System.out.println("---------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Branch no."+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no.:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no.: "+(k+1)+" in class no."+(j+1)+" is: "+arr[i][j][k] );
				}
			}
		}
	  }
	  
	

}

public class College_RevenueEx {

	public static void main(String[] args) {
		CollegeOperations co = new CollegeOperations();
		co.createArray();
		co.collectNamesData();
		co.calculateRevenueData();
		co.displayData();

	}

}
