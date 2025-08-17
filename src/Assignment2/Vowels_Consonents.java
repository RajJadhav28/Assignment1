package Assignment2;

import java.util.Scanner;

public class Vowels_Consonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		String s=sc.next();
		s=s.toLowerCase();
		int count=0;
		int count1=0;
		System.out.println("Vowels:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				System.out.println(s.charAt(i));
				count++;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
					
					}else {
						System.out.println("Invalid!!!");
					}
				}
		System.out.println("Vowels counts:"+count);
		System.out.println("Conconents:");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
					System.out.println(s.charAt(i));
						count1++;
					}else {
						System.out.println("Invalid!!!");
					}
				}
		
		System.out.println("Conconents counts:"+count1);
				
			}

		
		
		}
		

	


