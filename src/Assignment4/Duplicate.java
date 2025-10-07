package Assignment4;

import java.util.HashSet;
import java.util.Scanner;

class duplicateElement{
	public HashSet<Integer> duplicate(int arr[]) {
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		int duplicate=0;
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		return duplicateElements;
	}
	public HashSet<Integer> unique(int arr[]) {
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		int duplicate=0;
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		return uniqueElements;
	}
	public HashSet<Integer> allElements(int arr[]) {
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		int duplicate=0;
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		return allElements;
	}
	public int duplicate1(int arr[]) {
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		HashSet<Integer>duplicateElements=new HashSet<Integer>();
		HashSet<Integer>allElements=new HashSet<Integer>();
		
		int duplicate=0;
		for(int num:arr) {
			if(!allElements.add(num)) {
				duplicateElements.add(num);
				duplicate++;
				uniqueElements.remove(num);
			}else {
				uniqueElements.add(num);
			}
		}
		return duplicate;
	}
}
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		duplicateElement obj=new duplicateElement();
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate Elements:"+obj.duplicate(arr));
		System.out.println("No.of dupicate Elements:"+obj.duplicate1(arr));
		System.out.println("Unique elements:"+obj.unique(arr));
		System.out.println("All Elements After removing duplicate:"+obj.allElements(arr));
		sc.close();
	}
}
