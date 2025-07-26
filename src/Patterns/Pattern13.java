package Patterns;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int n=sc.nextInt();
		int c;
		
		for(int i=1;i<=n;i++) {
			c=i;
		for(int j=1;j<=n;j++) {
		System.out.print(c +"	");
		c=c+n;
		sc.close();
		}
		System.out.println();
		}
	}

}
