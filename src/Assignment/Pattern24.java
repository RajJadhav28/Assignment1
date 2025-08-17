package Assignment;

public class Pattern24 {

	public static void main(String[] args) {
		 int n = 9; // Maximum number in the first row
	        
	        for (int i = 1; i <=5; i++) { // Outer loop for rows, runs 5 times for 5 rows
	            
	            // Inner loop to print leading spaces for alignment
	            for (int j = 1; j <=i; j++) {
	                System.out.print(" ");
	            }
	            
	            // Inner loop to print the sequence of numbers
	            for (int j = 1; j <= n - 2 * i; j++) {
	                System.out.print(j);
	            }
	            
	            System.out.println(); // Move to the next line after each row
	        }

	}

}
