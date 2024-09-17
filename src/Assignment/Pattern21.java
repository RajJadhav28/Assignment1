package Assignment;

public class Pattern21 {

	public static void main(String[] args) {
		int n = 4; // Number of rows
        int num = 1; // Start number
        
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            
            // Inner loop to print leading spaces for alignment
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++; // Increment the number for the next position
            }
            
            System.out.println();
        }

	}

}
