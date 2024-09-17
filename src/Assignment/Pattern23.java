package Assignment;

public class Pattern23 {

	public static void main(String[] args) {
          int n = 4; // Number of rows
        
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            int number = 2 * i - 1; // Calculate the odd number for the current row
            
            // Inner loop to print leading spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print the number repeated i*2-1 times
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(number);
            }
            
            System.out.println(); // Move to the next line after each row
        }

	}

}
