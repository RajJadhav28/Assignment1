package Assignment;

import java.util.Scanner;

public class QuadreticEquations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter coefficient a:");
        double a = sc.nextDouble();

        System.out.println("Enter coefficient b:");
        double b = sc.nextDouble();

        System.out.println("Enter coefficient c:");
        double c = sc.nextDouble();

      
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the discriminant to determine the roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("The roots are real and the same.");
            System.out.println("Root: " + root);
        } else {
            // Complex (imaginary) roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        sc.close();
	}

}
