package Assignment5;

import java.util.Scanner;

public class Palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int sum = 0;
        int c = 0;
        
        // Reverse and count zeros
        while(num != 0) {
            int rem = num % 10;
            if(rem == 0) {
                c++;
            }
            sum = sum * 10 + rem;
            num = num / 10;
        }
        
        // Print reversed with zeros
        System.out.print("Reversed: ");
        while(c > 0) {
            System.out.print("0");
            c--;
        }
        System.out.println(sum);
        
        sc.close();
    }
}
