package Patterns;
import  java.util.Scanner;
public class Pattern28 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size:");
	int n=sc.nextInt();
	 for(int i=1; i<=n; i++) {
         for(int j=1; j<=(n-i); j++) {
             System.out.print("  ");
         }
         for(int k=1; k<=(2*i)-1; k++) {
              
             if( k==1 || k== (2*i)-1 )      
                 System.out.print(i+" ");
             else
                 System.out.print("  ");
         }
         System.out.println();
     }
     for(int i=n-1; i>=1; i--) {
          
         for(int j=1; j<=(n-i); j++) {
              
             System.out.print("  ");
         }
         for(int k=1; k<=(2*i)-1; k++) {
              
             if( k==1 || k== (2*i)-1 )       
                 System.out.print(i+" ");
             else

                 System.out.print("  ");
         }
          
         System.out.println();
     }
 	}
}
	


