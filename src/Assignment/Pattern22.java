package Assignment;

public class Pattern22 {

	public static void main(String[] args) {
          int n = 4; // Number of rows
        
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            
            // Inner loop to print leading spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Inner loop to print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println(); // Move to the next line after each row
        }
	}

}
