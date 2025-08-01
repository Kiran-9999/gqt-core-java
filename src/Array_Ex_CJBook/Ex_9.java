package Array_Ex_CJBook;
import java.util.Scanner;

public class Ex_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }

        sc.close();
    }
}