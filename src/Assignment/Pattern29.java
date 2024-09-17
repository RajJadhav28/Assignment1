package Assignment;

public class Pattern29 {

	public static void main(String[] args) {
		 int n = 5; // Size of the square

	        for (int i = 1; i <= n; i++) { // Outer loop for rows
	            for (int j = 1; j <= n; j++) { // Inner loop for columns
	                // Print '*' if it's on the border, otherwise print a space
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }

	}

}
