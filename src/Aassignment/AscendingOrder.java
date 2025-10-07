package Aassignment;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp;
        
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Array in ascending order:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}