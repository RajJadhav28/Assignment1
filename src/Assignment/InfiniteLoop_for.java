package Assignment;

import java.util.Scanner;

public class InfiniteLoop_for {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		for(;;) {
			System.out.println("Enter a number of type exit to quit.");
			String input=sc.next();
			if(input.equalsIgnoreCase("exit")) {
				System.out.println("Exited the loop.");
				break;
			}
			try {
				int number=Integer.parseInt(input);
				System.out.println("You entered:"+number);
			}catch(NumberFormatException e) {
				System.out.println("Invalid input.Please enter a number.");
			}
		}
		sc.close();

	}

}
