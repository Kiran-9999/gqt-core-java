package Array_Ex_CJBook;

import java.util.Scanner;
public class Ex_8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] sourceArray = new int[n];
        int[] destinationArray = new int[n];

        System.out.println("Enter " + n + " elements into the source array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sourceArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("\nElements copied to destination array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + destinationArray[i]);
        }

        sc.close();
    }
}