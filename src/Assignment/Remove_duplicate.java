package Assignment;

import java.util.Scanner;

public class Remove_duplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s = sc.nextInt();
        int arr[] = new int[s];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {  // Loop should go up to arr.length
            arr[i] = sc.nextInt();
        }

        // Removing duplicates (assuming array is sorted)
        int temp[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j++] = arr[arr.length - 1];  // Add the last element

        System.out.println("Array after removing the duplicate elements:");
        for (int i = 0; i < j; i++) {  // Printing the array up to the new length
            System.out.print(temp[i] + " ");
        }

        sc.close();  // Close the Scanner to prevent resource leaks
    }
}
