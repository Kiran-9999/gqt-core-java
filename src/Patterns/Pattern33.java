package Patterns;
import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++) {
            for (int j=(n-1); j>=i;j--){
                System.out.print(" ");
            }
            for (int k=i; k>=0;k--){
                System.out.print(k);
            }
            for (int l=1;l<=i;l++) {
                System.out.print(l);
            }
            System.out.println();

        }

    }
}