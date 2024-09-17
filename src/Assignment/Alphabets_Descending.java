package Assignment;

import java.util.Scanner;

public class Alphabets_Descending {

	public static void main(String[] args) {
		System.out.println("A-Z in descending order:");
		for(int i=90;i>=65;i--) {
			System.out.print((char)i+" ");
		}
		System.out.println("\na-z in descending order:");
		for(int i=122;i>=97;i--) {
			System.out.print((char)i+" ");
		}
	}

}
