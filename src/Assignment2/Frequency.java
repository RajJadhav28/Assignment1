package Assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer, Integer> fequMap=new HashMap<Integer, Integer>();
		for(int num:arr) {
			fequMap.put(num, fequMap.getOrDefault(num, 0)+1);
		}
		
		System.out.println("Frequency of elements:");
		for(Map.Entry entry:fequMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
