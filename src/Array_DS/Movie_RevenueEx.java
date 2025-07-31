package Array_DS;
import java.util.Scanner;
class MovieOperations{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc  = new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter Language count: ");
		int lan=sc.nextInt();
		System.out.println("enter Category count in each language:");
		int cat=sc.nextInt();
		System.out.println("Enter movie count in each category: ");
		int mov =sc.nextInt();
		
		arr=new long[lan][cat][mov];
		System.out.println("Array created!!!!");
		System.out.println("-----------------");
		
		System.out.println("Enter the invest made :");
		investment =sc.nextLong();
		System.out.println("enter the profit made previous year: ");
	    prev_profit=sc.nextLong();		
	}
	
	
	void collectRevenueData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Language No.: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category No.: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the revenue of movie no. "+(k+1));
					arr[i][j][k]=sc.nextLong();
					sum_revenue += arr[i][j][k];
				}
			}
			
		}
		System.out.println("data collected and caliculated!!!!");	
	}
	
	void DisplayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language no.: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category No.: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the revenue of movie no. "+(k+1)+" is= "+arr[i][j][k]);
	
				}
				}
			}
		System.out.println("--------------");
		System.out.println("Overall revenue  ="+sum_revenue);
		System.out.println("--------------");
		if(sum_revenue>investment) {
			long profit=(sum_revenue-investment);
			System.out.println("the profit made by Hemanth is "+profit);
			if(profit>prev_profit) {
				System.out.println("Hemnath has made more profit than previous year!!!!");
			}
			else {
				System.out.println("Hemanth has not made more profit than previous year");
			}
			
		}
		else {
			System.out.println("the loss incured by hemanth is ="+(investment - sum_revenue));
		}
		
		}
				
}


public class Movie_RevenueEx {

	public static void main(String[] args) {
		MovieOperations mo =new MovieOperations();
		mo.createArray();
		mo.collectRevenueData();
		mo.DisplayData();
	}

}
