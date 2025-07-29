package Universal_AtoZ_Patterns;
import java.util.Scanner;
public class Numbers_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<n;j++) {
				//Number-1
				
				if(i+j==n/2 || j==n/2 || i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 2
			for(int j=0;j<n;j++) {
				if(i==0||j==n-1&&i<=n/2 || i==n/2 || j==0 && i>=n/2 || i==n-1) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			for(int j=0;j<n;j++) {
				//Number-3
				
				if(i==0||j==n-1&&i<=n/2 || i==n/2 || j==n-1 && i>=n/2 || i==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 4
			for(int j=0;j<n;j++) {
				
				if(j==0 && i<=n/2 || i==n/2 || j==n-1 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 5			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==0&&i<=n/2 || i==n/2 || j==n-1 && i>=n/2 || i==n-1 ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 6			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==0 || i==n/2 || j==n-1 && i>=n/2 || i==n-1  ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 7			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==n-1 ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 8			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==0 || i==n/2 || j==n-1 || i==n-1  ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 9			
			for(int j=0;j<n;j++) {
				
				if(i==0|| i==n/2 || j==0 && i<=n/2 || j==n-1 || i==n-1  ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Number 0			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==0 || i==n-1 || j==n-1 ) 
				{

					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			System.out.println();
		}
	}

}
