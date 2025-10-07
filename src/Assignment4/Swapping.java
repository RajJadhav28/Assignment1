package Assignment4;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.next();
		
		String words[]=s.split(" ");
		
		for(int i=0;i<words.length/2;i++) {
			String temp=words[i];
			words[i]=words[words.length-1-i];
			words[words.length-1-i]=words[i];
		}
		
		for(int i=words.length;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.println(words[j]);
				if(j!=i-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
